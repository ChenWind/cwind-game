package com.cwind.net.common.entity;

/**
 * 
 * @description ����Ϣ
 * @author chenzf
 * @Date 2013 2013-1-13
 */
public class NetTpPack {

	/**
	 * ������
	 */
	private short packLen;

	/**
	 * ������
	 */
	private byte[] dataBuf;

	public short getPackLen() {
		return packLen;
	}

	public void setPackLen(short packLen) {
		this.packLen = packLen;
	}

	public byte[] getDataBuf() {
		return dataBuf;
	}

	public void setDataBuf(byte[] dataBuf) {
		this.dataBuf = dataBuf;
	}
}
