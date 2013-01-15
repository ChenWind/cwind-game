package com.cwind.net.message.handle;

import com.cwind.net.common.entity.CWTBasicMessage;
import com.cwind.net.common.entity.CWTPackObj;

/**
 * 
 * @description
 * @author chenzf
 * @Date 2013 2013-1-13
 */
public class CWTConnectHandle extends CWTMsBasicHandle {

	public CWTConnectHandle(int handleID) {
		super(handleID);
	}

	@Override
	protected CWTPackObj dealSendBuf() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void dealRecBuf(CWTBasicMessage obj) {
		this.sendNext = false;
	}

}
