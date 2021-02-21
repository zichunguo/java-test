package com.guo.test.sort;

/**
 * 插入排序
 * 算法描述
 * 从第一个元素开始，该元素可以认为已经被排序
 * 取出下一个元素，在已经排序的元素序列中从后向前扫描
 * 如果该元素（已排序）大于新元素，将该元素移到下一位置
 * 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置
 * 将新元素插入到该位置中
 * 重复步骤2~5
 * @author guo
 * @date 2020/11/13
 */
public class SortOfInsertTest {
	public static void main(String[] args) {
		int[] arr = {2, 1, 3, 6, 4, 8, 9, 5, 0};
		printArr(arr);
		sortOfInsert(arr);
		printArr(arr);
	}

	/**
	 * 插入排序
	 */
	public static void sortOfInsert(int[] arr) {
		int temp;
		int preIndex;
		for (int i = 1; i < arr.length; i++) {
			temp = arr[i];
			preIndex = i - 1;
			while (preIndex >= 0 && arr[preIndex] > temp) {
				arr[preIndex + 1] = arr[preIndex];
				preIndex--;
			}
			arr[preIndex + 1] = temp;
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
