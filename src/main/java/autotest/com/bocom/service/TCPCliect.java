package autotest.com.bocom.service;

import autotest.com.bocom.bean.EntranceBean;

public interface TCPCliect {
	public String sendByTCP(String xml,EntranceBean entrance,String interfaceType) throws Exception;
}
