package com.cwind.net.message.handle;

import com.cwind.net.common.entity.CWTPackObj;

/**
 * 
 * @description ��Ϣ��������
 * @author chenzf
 * @Date 2013 2013-1-13
 */
public interface CWTIMsHandleCenter extends CWTIMsHandler {

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
	public void sendNotifyMs(CWTPackObj obj);
}
