package com.cwind.net.message.handle;

import com.cwind.net.common.entity.CWindTpPackObj;

/**
 * 
 * @description ��Ϣ��������
 * @author chenzf
 * @Date 2013 2013-1-13
 */
public interface CWindIMsHandleCenter extends CWindIMsHandler {

	/**
	 * 
	 * @return
	 * @description ��ϢID
	 * @Date 2013 2013-1-13
	 * @author chenzf
	 */
	public long handleCenterID();

	/**
	 * 
	 * @param objx
	 * @description ֱ�ӷ���
	 * @Date 2013 2013-1-13
	 * @author chenzf
	 */
	public void sendNotifyMs(CWindTpPackObj obj);
}
