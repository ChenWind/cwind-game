package com.cwind.net.common.entity;

/**
 * 
 * @description 基础数据处理方式;此部分数据为处理完毕到下一级
 * @author chenzf
 * @Date 2013 2013-1-12
 */
public class NetTpMessage {
	/**
	 * 消息命令：{@link NetTpCommand}
	 */
	
	private byte msCmd;
	/**
	 * 消息编辑格式，默认0
	 */
	private byte msEncoding;

	/**
	 * 消息ID
	 */
	private int msID;

	/**
	 * 本身消息携带的数据 ，可以为空，本身消息可以不携带任何数据
	 */
	private NetTpPack msContent;

	/**
	 * 本次请求携带的数据
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
	 * @description 返回消息类型
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
