/**
 * ʵ���
 */
package com.cwind.net.common.entity;

/**
 * 
 * @description ����Э������� �˲��ֵ�����Ԥ�ȶ���ã���ֹ��������ݽ��и���
 *              <p>
 *              ĳ������£��˲��������ǲ���Ҫ�����κδ����ڴ��͵�ʱ�򣬱���Ԥ���趨
 *              </p>
 * @author chenzf
 * @Date 2013 2013-1-11
 */
public class NetTpCommand {
	/***
	 * ��������
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
	 * @description �����ַ���������
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
