package com.guo.test.enumtest;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;

/**
 * @author guo
 * @date 2021/2/21
 */
public class EnumTest {
	public static void main(String[] args) {
		System.out.println(Code.SUCCESS);
		Code[] values = Code.values();
//		Code.OK.setCode(100);
		for (Code e : values) {
			System.out.println(e + "---" + e.getCode() + "---" + e.ordinal() + "---" + e.getMsg());
		}
		// EnumSet的使用
		System.out.println("***  EnumSet展示  ***");
		EnumSet<Code> errSet = EnumSet.allOf(Code.class);
		for (Code e : errSet) {
			System.out.println(e.name() + " : " + e.ordinal());
		}

		// EnumMap的使用
		System.out.println("***  EnumMap展示  ***");
		EnumMap<Code, String> errMap = new EnumMap<>(Code.class);
		errMap.put(Code.SUCCESS, "成功");
		errMap.put(Code.ERROR, "失败");
		for (Map.Entry<Code, String> next : errMap.entrySet()) {
			System.out.println(next.getKey().name() + " : " + next.getValue());
		}
	}
}
