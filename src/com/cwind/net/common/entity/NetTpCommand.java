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
	public static final byte InvalidCommand = 0;
	public static final byte NetConnect = 1;
	public static final byte NetTestPack = 2;
	public static final byte NetLogin = 3;
	public static final byte NetLogout = 4;
	public static final byte GetData = 5;
	public static final byte UploadFile = 6;
	public static final byte DownloadFile = 7;

	/**
	 * 
	 * @param strCmd
	 * @return
	 * @description 解析字符串的命令
	 * @Date 2013 2013-1-12
	 * @author chenzf
	 */
	public byte parseStringCommand(String strCmd) {
		try {
			byte cmd = Byte.parseByte(strCmd);
			if (cmd < InvalidCommand || cmd > DownloadFile)
				return InvalidCommand;
			return cmd;
		} catch (Exception e) {
			return InvalidCommand;
		}
	}
}
