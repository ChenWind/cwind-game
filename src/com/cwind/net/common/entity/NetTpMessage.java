package com.cwind.net.common.entity;

/**
 * 
 * @description 基础数据处理方式
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
	
//	private short ms

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
