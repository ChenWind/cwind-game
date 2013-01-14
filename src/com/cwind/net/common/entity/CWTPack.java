package com.cwind.net.common.entity;

/**
 * 
 * @description 网络协议包，此部分具体详情见文档
 * @author chenzf
 * @Date 2013 2013-1-13
 */
public class CWTPack {
	private CWTPackObj cmdpack;
	private CWTPackObj datapack;

	public CWTPackObj getCmdpack() {
		return cmdpack;
	}

	public void setCmdpack(CWTPackObj cmdpack) {
		this.cmdpack = cmdpack;
	}

	public CWTPackObj getDatapack() {
		return datapack;
	}

	public void setDatapack(CWTPackObj datapack) {
		this.datapack = datapack;
	}

	public short getPackLen() {
		return 0;
	}
}
