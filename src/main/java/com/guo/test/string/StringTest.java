package com.guo.test.string;

/**
 * @author guo
 * @date 2021/2/21
 */
public class StringTest {
	public static void main(String[] args) {
		System.out.println("------ new String() ------");
		String ab1 = new String("ab");
		String ab2 = new String("ab");
		String ab3 = new String("ab");
		System.out.println(ab1 == ab2);
		System.out.println(ab2 == ab3);

		System.out.println("------ 直接赋值（字符串常量） ------");
		String abc1 = "abc";
		String abc2 = "abc";
		String abc3 = "abc";
		System.out.println(abc1 == abc2);
		System.out.println(abc2 == abc3);
	}
}
