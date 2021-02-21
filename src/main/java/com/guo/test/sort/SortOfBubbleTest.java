package com.guo.test.sort;

/**
 * 冒泡排序
 * 算法描述
 * 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
 * 针对所有的元素重复以上的步骤，除了最后一个。
 * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 * @author guo
 * @date 2020/11/13
 */
public class SortOfBubbleTest {
	public static void main(String[] args) {
		int[] arr = {2, 1, 3, 6, 4, 8, 9, 5, 0};
		printArr(arr);
		sortOfBubble(arr);
		printArr(arr);
	}

	/**
	 * 冒泡排序
 	 */
	public static void sortOfBubble(int[] arr) {
		int temp;// 记录临时中间值
		int size = arr.length;// 数组大小
		for (int i = 0; i < size - 1; i++) {
//			System.out.println("i : " + i);
			boolean flag = true;// 标志位，当初始数组已经是拍好序的，则不会进入if中，则第一次循环后直接退出
			for (int j = 0; j < size - i - 1; j++) {
//				System.out.println("j : " + j);
				if (arr[j] > arr[j + 1]) {// 交换两个值的位置
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = false;
				}
			}
			if (flag) {
				break;
			}
		}
	}

	/**
	 * 输出数组
	 */
	public static void printArr(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i < arr.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
}
