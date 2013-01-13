package com.cwind.net.message.handle;

import com.cwind.net.common.entity.CWindTpPackObj;

/**
 * 
 * @description 消息处理中心
 * @author chenzf
 * @Date 2013 2013-1-13
 */
public interface CWindIMsHandleCenter extends CWindIMsHandler {

	/**
	 * 
	 * @return
	 * @description 消息ID
	 * @Date 2013 2013-1-13
	 * @author chenzf
	 */
	public long handleCenterID();

	/**
	 * 
	 * @param objx
	 * @description 直接发送
	 * @Date 2013 2013-1-13
	 * @author chenzf
	 */
	public void sendNotifyMs(CWindTpPackObj obj);
}
