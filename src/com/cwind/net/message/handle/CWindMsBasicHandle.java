package com.cwind.net.message.handle;

import com.cwind.net.common.entity.CWindTpBasicMessage;

/**
 * ������ ����Ϊ����handle�����д���
 * 
 * @description
 * @author chenzf
 * @Date 2013 2013-1-13
 */
public abstract class CWindMsBasicHandle implements CWindIMsHandler {

	protected int handleid;

	public CWindMsBasicHandle(int handleID) {
		this.handleid = handleID;
	}

	@Override
	public void dealRecMs(CWindTpBasicMessage obj) {
		this.dealRecMs(obj, null);
	}

	@Override
	public void dealRecMs(CWindTpBasicMessage obj,
			CWindIMsHandlerNotify callback) {
		// TODO Auto-generated method stub

	}

}
