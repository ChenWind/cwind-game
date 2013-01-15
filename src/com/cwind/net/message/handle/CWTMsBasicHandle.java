package com.cwind.net.message.handle;

import com.cwind.net.common.entity.CWTBasicMessage;
import com.cwind.net.common.entity.CWTPackObj;

/**
 * ������ ����Ϊ����handle�����д���
 * 
 * @description
 * @author chenzf
 * @Date 2013 2013-1-13
 */
public abstract class CWTMsBasicHandle implements CWTIMsHandler {
	/**
     * 
     */
	protected int handleid;
	protected short resultCode;
	protected CWTHandleStatus status;
	protected volatile boolean sendNext;

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
	public void dealRecMs(CWTBasicMessage obj, CWTIMsHandlerNotify callback) {
		this.dealRecBuf(obj);
		if (this.sendNext) {
			CWTPackObj send = this.dealSendBuf();
			if (callback != null)
				callback.callBackHandle(send);
		}
	}

	/**
	 * ������һ������
	 * 
	 * @description
	 * @Date 2013 2013-1-15
	 * @author chenzf
	 */
	protected abstract CWTPackObj dealSendBuf();

	/**
	 * 
	 * @param obj
	 * @description �����������
	 * @Date 2013 2013-1-15
	 * @author chenzf
	 */
	protected abstract void dealRecBuf(CWTBasicMessage obj);
}
