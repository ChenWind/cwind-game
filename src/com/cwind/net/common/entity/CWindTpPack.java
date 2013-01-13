package com.cwind.net.common.entity;

/**
 * 
 * @description 网络协议包，此部分具体详情见文档
 * @author chenzf
 * @Date 2013 2013-1-13
 */
public class CWindTpPack {
	private CWindTpPackObj cmdpack;
	private CWindTpPackObj datapack;

	public CWindTpPackObj getCmdpack() {
		return cmdpack;
	}

	public void setCmdpack(CWindTpPackObj cmdpack) {
		this.cmdpack = cmdpack;
	}

	public CWindTpPackObj getDatapack() {
		return datapack;
	}

	public void setDatapack(CWindTpPackObj datapack) {
		this.datapack = datapack;
	}

	public short getPackLen() {
		return 0;
	}
}
