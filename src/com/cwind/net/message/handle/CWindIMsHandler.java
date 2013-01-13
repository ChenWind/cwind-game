package com.cwind.net.message.handle;

import com.cwind.net.common.entity.CWindTpBasicMessage;

/**
 * 
 * @description 消息处理
 * @author chenzf
 * @Date 2013 2013-1-13
 */
public interface CWindIMsHandler {

	public int getHandlerID();

	public CWindHandleStatus getStatus();

	public void dealRecMs(CWindTpBasicMessage obj);

	public void dealRecMs(CWindTpBasicMessage obj,
			CWindIMsHandlerNotify callback);
}
