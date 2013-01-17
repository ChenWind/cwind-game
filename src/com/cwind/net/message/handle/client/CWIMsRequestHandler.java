package com.cwind.net.message.handle.client;

import com.cwind.net.message.handle.CWTIMsHandler;

/**
 * 请求消息
 * 
 * @description
 * @author chenzf
 * @Date 2013 2013-1-17
 */
public interface CWIMsRequestHandler extends CWTIMsHandler {

	/**
	 * 处理发送消息
	            * @return  
	            * @description   
	            * @Date  2013 2013-1-17 
	            * @author chenzf
	 */
	public byte[] progressSend();
}
