package com.cwind.net.common.entity;

/**
 * 
 * @description 网络协议包，此部分具体详情见文档
 * @author chenzf
 * @Date 2013 2013-1-13
 */
public class NetCWindTpPack {
	private NetTpPack pack;
	private NetTpPack cmdpack;
	private NetTpPack datapack;

	public NetTpPack getAllPack() {
		return pack;
	}

	public void setAllPack(NetTpPack pack) {
		this.pack = pack;
	}

	public NetTpPack getCmdpack() {
		return cmdpack;
	}

	public void setCmdpack(NetTpPack cmdpack) {
		this.cmdpack = cmdpack;
	}

	public NetTpPack getDatapack() {
		return datapack;
	}

	public void setDatapack(NetTpPack datapack) {
		this.datapack = datapack;
	}
}
