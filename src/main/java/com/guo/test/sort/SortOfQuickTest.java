package com.guo.test.sort;

/**
 * 快速排序
 * 算法描述
 * 从数列中挑出一个元素，称为“基准”
 * 重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。
 * 在这个分割之后，该基准是它的最后位置。这个称为分割（partition）操作。
 * 递归地把小于基准值元素的子数列和大于基准值元素的子数列排序。
 * @author guo
 * @date 2020/11/13
 */
public class SortOfQuickTest {
	public static void main(String[] args) {
		int[] arr = {2, 1, 3, 6, 4, 8, 9, 5, 0};
		printArr(arr);
		sortOfQuick(arr, 0 , arr.length - 1);
		printArr(arr);
	}

	/**
	 * 快速排序
	 */
	public static void sortOfQuick(int[] arr, int start, int end) {
		if (start < end) {
			int i = start;// 从左到右进行查找时的“指针”，指示当前左位置
			int j = end;// 从右到左进行查找时的“指针”，指示当前右位置
			int base = arr[start];// 选定的基准值（第一个数值作为基准值）
			while (i < j) {
				// 当右边的数大于基准数时，略过，继续向左查找；不满足条件时跳出循环，此时的j对应的元素是小于基准元素的
				while (i < j && arr[j] > base) {
					j--;
				}
				arr[i] = arr[j]; // 将右边小于等于基准元素的数填入右边相应位置
				// 当左边的数小于等于基准数时，略过，继续向右查找；不满足条件时跳出循环，此时的i对应的元素是大于等于基准元素的(重复的基准元素集合到左区间)
				while (i < j && arr[i] <= base) {
					i++;
				}
				arr[j] = arr[i];// 将左边大于基准元素的数填入左边相应位置
			}
			arr[i] = base;// 将基准元素填入相应位置
			sortOfQuick(arr, start, i - 1);// 此时的i即为基准元素的位置；对基准元素的左边子区间进行相似的快速排序
			sortOfQuick(arr, i + 1, end);// 对基准元素的右边子区间进行相似的快速排序
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
