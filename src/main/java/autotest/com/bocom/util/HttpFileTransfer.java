package autotest.com.bocom.util;

import java.io.File;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public class HttpFileTransfer {
	/**
	 * http发送文件
	 * @param req 附带信息
	 * @return
	 */
	public static String sendFile(String req) {
		try {
			CloseableHttpClient httpClient = HttpClientBuilder.create().build();
			CloseableHttpResponse httpResponse = null;
			String uri ="";
			HttpPost httpPost = new HttpPost(uri);
			MultipartEntityBuilder multipartEntityBuilder = MultipartEntityBuilder.create();
			File file = new File("");
			multipartEntityBuilder.addTextBody("REQ_MESSAGE", req);
			multipartEntityBuilder.addBinaryBody("name=\"Filedata\";filename=\"文件名称\"", file);
			httpPost.addHeader("","");
			HttpEntity httpEntity = multipartEntityBuilder.build();
			httpPost.setEntity(httpEntity);
			httpResponse = httpClient.execute(httpPost);
			HttpEntity entity = httpResponse.getEntity();
			int statusCode = httpResponse.getStatusLine().getStatusCode();
			String str = EntityUtils.toString(entity,"UTF-8");
			return str;
		} catch (Exception e) {
			// TODO: handle exception
		}		
		return null;
	}
	/**
	 * http GET请求
	 * @param str
	 * @return
	 */
	public String getRequest(String str) {
		try {
			HttpClient httpClient = new DefaultHttpClient();
			String uri = "";
			HttpGet httpGet = new HttpGet(uri);
			RequestConfig config = RequestConfig.custom().setConnectTimeout(100).setConnectionRequestTimeout(200).setSocketTimeout(200).build();
			httpGet.setConfig(config);
			HttpResponse response;
			response = httpClient.execute(httpGet);
			int statusCode = response.getStatusLine().getStatusCode();
			return EntityUtils.toString(response.getEntity(), "UTF-8");
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}
