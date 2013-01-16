package com.cwind.net.message.handle;

/**
 * 因子
 * 
 * @description
 * @author chenzf
 * @Date 2013 2013-1-16
 */
public class CWFactor {
	private static int factor = 0;

	/**
	 * 
	 * @return
	 * @description 简单获取因子
	 * @Date 2013 2013-1-16
	 * @author chenzf
	 */
	public static final int simpleIntFactor() {
		return factor++;
	}
}
