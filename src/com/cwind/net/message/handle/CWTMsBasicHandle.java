package com.cwind.net.message.handle;

import com.cwind.net.common.entity.CWTBasicMessage;

/**
 * 抽象类 ，作为基础handle，进行处理
 * 
 * @description
 * @author chenzf
 * @Date 2013 2013-1-13
 */
public abstract class CWTMsBasicHandle implements CWTIMsHandler {

	protected int handleid;
	protected short resultCode;
	protected CWTHandleStatus status;

	public CWTMsBasicHandle(int handleID) {
		this.handleid = handleID;
		this.status = CWTHandleStatus.HandleInvaild;
	}

	@Override
	public int getHandlerID() {
		return this.handleid;
	}

	@Override
	public CWTHandleStatus getStatus() {
		return this.status;
	}

	@Override
	public short getResultCode() {
		return this.resultCode;
	}

	@Override
	public void dealRecMs(CWTBasicMessage obj) {
		this.dealRecMs(obj, null);
	}

	@Override
	public void dealRecMs(CWTBasicMessage obj,
			CWTIMsHandlerNotify callback) {
		// TODO Auto-generated method stub

	}

}
