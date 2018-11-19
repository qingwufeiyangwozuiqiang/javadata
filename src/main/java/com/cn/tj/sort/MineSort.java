package com.cn.tj.sort;

/**
 * @author zhaogl
 * @Description:
 * @date 2018年11月19日 上午10:19:04
 * @version 1.0
 * @since 1.0
 */
public class MineSort
{
	/**
	 * 冒泡法：位置相邻的两个数互相比较，调整两个值的顺序 内外两层分别循环 外层：从0到size-1 内层：从0到size-1-i
	 */
	public static void bubbleSort(long[] arr)
	{
		long tmp = 0;
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = arr.length - 1; j > i; j--)
			{
				if (arr[j - 1] > arr[j])
				{
					tmp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = tmp;
				}
			}
		}
	}

	/**
	 * 插入排序：双层遍历该元素，第一层从0到size-1，第二层只需要保证相邻元素i与i-1之间是否相等
	 */
	public static void insertSort(long[] arr)
	{
		long tmp = 0;
		for (int i = 1; i < arr.length; i++)
		{
			tmp = arr[i];
			int j = i;
			while (j > 0 && arr[j - 1] > arr[j])
			{
				tmp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = arr[j];
			}
		}
	}

	/**
	 * 基本思想为每一趟从待排序的数据元素中选择最小（或最大）的一个元素作为首元素，直到所有元素排完为止，简单选择排序是不稳定排序
	 */
	public static void selectSort(long[] arr)
	{
		long tmp = 0;
		int k = 0;
		for (int i = 0; i < arr.length - 1; i++)
		{
			k = i;
			for (int j = i; j < arr.length; j++)
			{
				if (arr[j] < arr[k])
				{
					k = j;
				}
			}
			tmp = arr[i];
			arr[i] = arr[k];
			arr[k] = tmp;
		}
	}
}
