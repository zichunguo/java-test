package com.guo.test.sort;

/**
 * 选择排序
 * 算法描述
 * 在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，再从剩余未排序元素中继续寻找最小（大）元素，然后放到排序序列末尾。
 * 以此类推，直到所有元素均排序完毕。
 * @author guo
 * @date 2020/11/13
 */
public class SortOfSelectTest {
	public static void main(String[] args) {
		int[] arr = {2, 1, 3, 6, 4, 8, 9, 5, 0};
		printArr(arr);
		sortOfSelect(arr);
		printArr(arr);
	}

	/**
	 * 选择排序
	 */
	public static void sortOfSelect(int[] arr) {
		int temp;
		int minIndex;
		int size = arr.length;
		for (int i = 0; i < size - 1; i++) {
			minIndex = i;
			for (int j = i + 1; j < size; j++) {
				if (arr[j] < arr[minIndex]) {// 寻找最小的值
					minIndex = j;// 将最小值的索引保存
				}
			}
			temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
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
