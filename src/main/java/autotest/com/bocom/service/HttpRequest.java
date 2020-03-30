package autotest.com.bocom.service;

import autotest.com.bocom.bean.EntranceBean;

public interface HttpRequest {
	public String debugCases(String reqMsg,EntranceBean entrance,String reqMsgLen) throws Exception;
}
