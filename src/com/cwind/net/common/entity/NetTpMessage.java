package com.cwind.net.common.entity;

/**
 * 
 * @description �������ݴ���ʽ
 * @author chenzf
 * @Date 2013 2013-1-12
 */
public class NetTpMessage {
	/**
	 * ��Ϣ���{@link NetTpCommand}
	 */
	private byte msCmd;
	/**
	 * ��Ϣ�༭��ʽ��Ĭ��0
	 */
	private byte msEncoding;
	
//	private short ms

	/**
	 * 
	 * @return
	 * @description ������Ϣ����
	 * @Date 2013 2013-1-12
	 * @author chenzf
	 */
	public byte getMsCmd() {
		return msCmd;
	}

	/**
	 * 
	 * @param msCmd
	 * @description
	 * @Date 2013 2013-1-12
	 * @author chenzf
	 */
	public void setMsCmd(byte msCmd) {
		this.msCmd = msCmd;
	}

	public byte getMsEncoding() {
		return msEncoding;
	}

	public void setMsEncoding(byte msEncoding) {
		this.msEncoding = msEncoding;
	}
}
