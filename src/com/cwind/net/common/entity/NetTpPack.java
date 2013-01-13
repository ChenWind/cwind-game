package com.cwind.net.common.entity;

/**
 * 
 * @description 包信息
 * @author chenzf
 * @Date 2013 2013-1-13
 */
public class NetTpPack {

	/**
	 * 包长度
	 */
	private short packLen;

	/**
	 * 包数据
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
