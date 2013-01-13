package com.cwind.net.message.handle;

import com.cwind.net.common.entity.CWindTpPackObj;

/**
 * 
 * @description 一般的消息回调，将当前的信息回调给当前的处理者。
 * @author chenzf
 * @Date 2013 2013-1-13
 */
public interface CWindIMsHandlerNotify {

	/**
	 * 
	 * @param obj
	 * @description 回调给当前的处理者
	 * @Date 2013 2013-1-13
	 * @author chenzf
	 */
	public void callBackHandle(CWindTpPackObj obj);
}
