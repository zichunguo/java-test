package com.guo.test.array;

/**
 * @author guo
 * @date 2021/2/21
 */
public class ArrayTest {
	public static void main(String[] args) {
		int[] arr = {32, 321, 9, 10};
		long max = testArrayMax(arr);
		System.out.println("max:" + max);
	}

	// 给定一个数组，返回数组中元素拼接后最大的值
	public static long testArrayMax(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (sort(arr[i], arr[j]) > 0) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = arr.length - 1; i >= 0; i--) {
			sb.append(arr[i]);
		}
		System.out.println("拼接最大值：" + sb.toString());
		return Long.parseLong(sb.toString());
	}

	public static int sort(int a, int b) {
		int oa = Integer.parseInt(a + "" + b);
		int ob = Integer.parseInt(b + "" + a);
		return oa - ob;
	}
}
