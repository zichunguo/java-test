package com.guo.test.snowflake;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;

/**
 * 测试 hutool 工具中的 snowflake
 * @author guo
 * @date 2020/11/13
 */
public class SnowFlakeOfHutool {

	public static void main(String[] args) {
		// 使用
		Snowflake snowflake = IdUtil.getSnowflake(1, 1);
		long id = snowflake.nextId();
		System.out.println(id);
	}

}
