package com.cwind.net.common.entity;

/**
 * 
 * @description �������ݴ���ʽ;�˲�������Ϊ������ϵ���һ��
 * @author chenzf
 * @Date 2013 2013-1-12
 */
public class CWTpBasicMessage {
	/**
	 * ��Ϣ���{@link CWTpCommand}
	 */

	private byte msCmd;
	/**
	 * ��Ϣ�༭��ʽ��Ĭ��0
	 */
	private byte msEncoding;

	/**
	 * ��ϢID
	 */
	private int msID;

	/**
	 * һ��Ϊ�գ�������cmd��ǰ������Ҫ��ͬ��
	 */
	private CWindTpPackObj msContent;

	public int getMsID() {
		return msID;
	}

	public void setMsID(int msID) {
		this.msID = msID;
	}

	public CWindTpPackObj getMsContent() {
		return msContent;
	}

	public void setMsContent(CWindTpPackObj msContent) {
		this.msContent = msContent;
	}

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
