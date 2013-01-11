/**
 * 实体包
 */
package com.cwind.net.common.entity;

/**
 * 
 * @description 网络协议层的命令， 此部分的命令预先定义好，防止后面的数据进行更改
 *              <p>
 *              某种情况下，此部分内容是不需要进行任何处理，在传送的时候，必须预先设定
 *              </p>
 * @author chenzf
 * @Date 2013 2013-1-11
 */
public class NetTpCommand {
	/***
	 * 网络连接
	 */
	public static final String NetConnect = "001";
	public static final String NetTestPack = "002";
	public static final String NetLogin = "003";
	public static final String NetLogout = "004";
	public static final String GetData = "005";
	public static final String UploadFile = "006";
	public static final String DownloadFile = "007";
}
