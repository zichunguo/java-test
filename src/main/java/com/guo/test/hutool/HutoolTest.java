package com.guo.test.hutool;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.net.NetUtil;
import cn.hutool.core.util.IdUtil;

/**
 * @author guo
 * @date 2021/2/21
 */
public class HutoolTest {
	public static void main(String[] args) {
//		testHutoolSnowflake();
		testNetUtil();
	}

	/**
	 * 测试 hutool 工具中的 snowflake
	 */
	public static void testHutoolSnowflake() {
		// 使用
		Snowflake snowflake = IdUtil.getSnowflake(1, 1);
		long id = snowflake.nextId();
		System.out.println(id);
	}

	/**
	 * 测试 hutool 工具中的 ip
	 */
	public static void testNetUtil() {
		String localhostStr = NetUtil.getLocalhostStr();
		long ipv4ToLong = NetUtil.ipv4ToLong(localhostStr);
		System.out.println(localhostStr);
		System.out.println(ipv4ToLong);
	}
}
