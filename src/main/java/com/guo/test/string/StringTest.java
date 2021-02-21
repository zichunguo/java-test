package com.guo.test.string;

/**
 * @author guo
 * @date 2021/2/21
 */
public class StringTest {
	public static void main(String[] args) {
		System.out.println("------ new String() ------");
		String strab1 = new String("ab");
		String strab2 = new String("ab");
		String strab3 = new String("ab");
		System.out.println(strab1 == strab2);
		System.out.println(strab2 == strab3);

		System.out.println("------ 直接赋值（字符串常量） ------");
		String strabc1 = "abc";
		String strabc2 = "abc";
		String strabc3 = "abc";
		System.out.println(strabc1 == strabc2);
		System.out.println(strabc2 == strabc3);
	}
}
