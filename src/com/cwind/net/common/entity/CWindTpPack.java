package com.cwind.net.common.entity;

/**
 * 
 * @description ����Э������˲��־���������ĵ�
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
