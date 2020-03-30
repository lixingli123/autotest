package autotest.com.bocom.serviceImpl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import org.springframework.stereotype.Service;

import autotest.com.bocom.bean.EntranceBean;
import autotest.com.bocom.service.TCPCliect;
@Service
public class TCPClientImpl implements TCPCliect{

	@Override
	public String sendByTCP(String xml, EntranceBean entrance, String interfaceType) throws Exception {
		Socket socket = null;
		  OutputStream outputStream = null;
		  InputStream inputStream = null;
		  ByteArrayOutputStream bos = null;
        //创建Socket对象
  	  try {
			 socket=new Socket(entrance.getSendHostname(),entrance.getSendPort());
		  }catch (Exception e) {
			  e.printStackTrace();
			  throw new Exception(e.getLocalizedMessage());
		  }   
        try {
      	  //获取一个输出流，向服务端发送信息
			  outputStream=socket.getOutputStream();
			  inputStream=socket.getInputStream();//获取一个输入流，接收服务端的信息
	          outputStream.write(xml.getBytes(entrance.getSendCharset()));
	          outputStream.flush();
	          socket.shutdownOutput();
		  } catch (IOException e) {
			  e.printStackTrace();
			  throw new Exception(e.getLocalizedMessage());
		  }
        //0-单项 1-双向
        if("0".equals(interfaceType)) {
        	return "0";
        }
        try {
      	  byte buffer[] = new byte[1024];
      	  int len = 0;
      	  bos = new ByteArrayOutputStream();
      	  while((len = inputStream.read(buffer)) != -1) {
      		  bos.write(buffer,0,len);
      		  bos.flush();
      	  }
      	  System.out.println("返回报文："+bos.toString());
      	  return bos.toString();
        } catch (Exception e) {
			  e.printStackTrace();
			  throw new Exception(e.getLocalizedMessage());
        }   
	}

}
