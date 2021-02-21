package com.guo.test.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * @author guo
 * @date 2021/2/21
 */
public class HashTest {
	/**
	 * hash值相同，但 equals 不为 true
	 * Java对于eqauls方法和hashCode方法的规定：
	 * 		1)如果两个对象相同（equals方法返回true），那么它们的hashCode值一定要相同；
	 * 		2)如果两个对象的hashCode相同，它们并不一定相同。
	 */
	public static void main(String[] args) {
		String str1 = "通话";
		String str2 = "重地";
		System.out.println("'通话' hashCode = " + str1.hashCode());
		System.out.println("'重地' hashCode = " + str2.hashCode());
		System.out.println("equals：" + str1.equals(str2));
		System.out.println("contentEquals：" + str1.contentEquals(str2));// 比较内容是否相等

		Map<String, String> map = new HashMap<>();
		map.put(str1, "aaa");
		map.put(str2, "bbb");
		System.out.println(map);
	}
}
