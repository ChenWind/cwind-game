package com.cwind.net.message.handle;

import com.cwind.net.common.entity.CWTBasicMessage;

/**
 * 
 * @description 消息处理
 * @author chenzf
 * @Date 2013 2013-1-13
 */
public interface CWTIMsHandler {

	public int getHandlerID();

	public CWTHandleStatus getStatus();

	/**
	 * 
	 * @return
	 * @description 返回当前的code，有则返回，否则为空
	 * @Date 2013 2013-1-13
	 * @author chenzf
	 */
	public short getResultCode();

	public void dealRecMs(CWTBasicMessage obj);

	public void dealRecMs(CWTBasicMessage obj,
			CWTIMsHandlerNotify callback);
}
