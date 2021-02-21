package com.guo.test.finaltest;

/**
 * @author guo
 * @date 2021/2/21
 */
public class FinalTest {
	private static final int[] arr= {1,2,3};
	private static final int a = 1;

	public static void main(String[] args) {
		print(FinalTest.arr);
		FinalTest.arr[1] = 333;
		print(FinalTest.arr);
		System.out.println(FinalTest.a);
	}

	/**
	 * 打印数组
	 */
	private static void print(int[] arr) {
		System.out.print("[");
		for (int i = 0 ; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i < arr.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
}
