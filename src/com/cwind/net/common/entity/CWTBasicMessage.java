package com.cwind.net.common.entity;

/**
 * 
 * @description 基础数据处理方式;此部分数据为处理完毕到下一级
 * @author chenzf
 * @Date 2013 2013-1-12
 */
public class CWTBasicMessage {
	/**
	 * 消息命令：{@link CWTCommand}
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
	 * 一般为空，但部分cmd当前可能需要有同的
	 */
	private CWTPackObj msContent;

	public int getMsID() {
		return msID;
	}

	public void setMsID(int msID) {
		this.msID = msID;
	}

	public CWTPackObj getMsContent() {
		return msContent;
	}

	public void setMsContent(CWTPackObj msContent) {
		this.msContent = msContent;
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
