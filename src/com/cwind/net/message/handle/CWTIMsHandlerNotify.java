package com.cwind.net.message.handle;

import com.cwind.net.common.entity.CWTPackObj;

/**
 * 
 * @description һ�����Ϣ�ص�������ǰ����Ϣ�ص�����ǰ�Ĵ����ߡ�
 * @author chenzf
 * @Date 2013 2013-1-13
 */
public interface CWTIMsHandlerNotify {

	/**
	 * 
	 * @param obj
	 * @description �ص�����ǰ�Ĵ�����
	 * @Date 2013 2013-1-13
	 * @author chenzf
	 */
	public void callBackHandle(CWTPackObj obj);
}
