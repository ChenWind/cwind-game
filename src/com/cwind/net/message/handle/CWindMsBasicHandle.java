package com.cwind.net.message.handle;

import com.cwind.net.common.entity.CWindTpBasicMessage;

/**
 * 抽象类 ，作为基础handle，进行处理
 * 
 * @description
 * @author chenzf
 * @Date 2013 2013-1-13
 */
public abstract class CWindMsBasicHandle implements CWindIMsHandler {

	protected int handleid;
	protected short resultCode;
	protected CWindHandleStatus status;

	public CWindMsBasicHandle(int handleID) {
		this.handleid = handleID;
		this.status = CWindHandleStatus.HandleInvaild;
	}

	@Override
	public int getHandlerID() {
		return this.handleid;
	}

	@Override
	public CWindHandleStatus getStatus() {
		return this.status;
	}

	@Override
	public short getResultCode() {
		return this.resultCode;
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
