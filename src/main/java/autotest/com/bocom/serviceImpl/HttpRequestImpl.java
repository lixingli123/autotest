package autotest.com.bocom.serviceImpl;

import java.nio.charset.Charset;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;

import autotest.com.bocom.bean.EntranceBean;
import autotest.com.bocom.service.HttpRequest;
@Service
public class HttpRequestImpl implements HttpRequest{

	@Override
	public String debugCases(String reqMsg, EntranceBean entrance, String reqMsgLen) throws Exception {
		int timeOut = 5000;
		try {
			reqMsg = "REQ_MESSAGE"+ reqMsg;
			System.out.println("发送IP："+entrance.getSendHostname());
			System.out.println("发送端口："+entrance.getSendPort());
			System.out.println("接口Code："+entrance.getAttribute());
			System.out.println("系统名称："+entrance.getSendChannel());
			HttpClient httpClient = new DefaultHttpClient();
			 String url = entrance.getSendHostname();
			 url = url.replace("$InterfaceCode$", entrance.getAttribute());
			 System.out.println("发送地址:"+url);
			 HttpPost httpPost = new HttpPost(url);
			 httpPost.addHeader("Content-type","application/json;charset=utf-8");
			 httpPost.setHeader("Accept","application/json");
			if(entrance.getSendWaitinterval()!=0) {
				timeOut = entrance.getSendWaitinterval();
			} 
			RequestConfig config = RequestConfig.custom().setConnectTimeout(timeOut).setConnectionRequestTimeout(timeOut).setSocketTimeout(timeOut).build();
			httpPost.setConfig(config);
			System.out.println("发送报文:"+reqMsg);
			  
			 httpPost.setEntity(new StringEntity(reqMsg, Charset.forName("utf-8").toString()));
			 HttpResponse httpResponse;
			httpResponse = httpClient.execute(httpPost);
			int code = httpResponse.getStatusLine().getStatusCode();
			System.out.println(code);
			String rev = EntityUtils.toString(httpResponse.getEntity());
			System.out.println("返回报文:"+rev);
			return rev;
		} catch (Exception e) {
			e.printStackTrace();
			return e.getLocalizedMessage();
		}
	}

}
