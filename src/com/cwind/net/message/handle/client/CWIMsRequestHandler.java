package com.cwind.net.message.handle.client;

import com.cwind.net.message.handle.CWTIMsHandler;

/**
 * ������Ϣ
 * 
 * @description
 * @author chenzf
 * @Date 2013 2013-1-17
 */
public interface CWIMsRequestHandler extends CWTIMsHandler {

	/**
	 * ��������Ϣ
	            * @return  
	            * @description   
	            * @Date  2013 2013-1-17 
	            * @author chenzf
	 */
	public byte[] progressSend();
}
