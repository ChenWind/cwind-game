package com.cwind.net.message.handle;

import com.cwind.net.common.entity.CWTpBasicMessage;

/**
 * 
 * @description ��Ϣ����
 * @author chenzf
 * @Date 2013 2013-1-13
 */
public interface CWindIMsHandler {

	public int getHandlerID();

	public CWindHandleStatus getStatus();

	/**
	 * 
	 * @return
	 * @description ���ص�ǰ��code�����򷵻أ�����Ϊ��
	 * @Date 2013 2013-1-13
	 * @author chenzf
	 */
	public short getResultCode();

	public void dealRecMs(CWTpBasicMessage obj);

	public void dealRecMs(CWTpBasicMessage obj,
			CWindIMsHandlerNotify callback);
}
