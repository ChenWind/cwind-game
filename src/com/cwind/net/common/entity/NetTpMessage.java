package com.cwind.net.common.entity;

/**
 * 
 * @description �������ݴ���ʽ;�˲�������Ϊ������ϵ���һ��
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

	/**
	 * ��ϢID
	 */
	private int msID;

	/**
	 * ������ϢЯ�������� ������Ϊ�գ�������Ϣ���Բ�Я���κ�����
	 */
	private NetTpPack msContent;

	/**
	 * ��������Я��������
	 */
	private NetTpPack data;

	public int getMsID() {
		return msID;
	}

	public void setMsID(int msID) {
		this.msID = msID;
	}

	public NetTpPack getMsContent() {
		return msContent;
	}

	public void setMsContent(NetTpPack msContent) {
		this.msContent = msContent;
	}

	public NetTpPack getData() {
		return data;
	}

	public void setData(NetTpPack data) {
		this.data = data;
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
