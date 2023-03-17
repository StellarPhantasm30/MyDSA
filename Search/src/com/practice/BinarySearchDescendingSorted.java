package com.practice;

import java.util.Scanner;

public class BinarySearchDescendingSorted {

	public static int binarySearch(int[] arr, int key) {
		int left = 0;
		int right = arr.length - 1;

		for (int i = 0; i < arr.length; i++) {
			int mid = (left + right) / 2;
			if (arr[mid] == key)
				return mid + 1;
			if (key < arr[mid])
				left = mid + 1;
			else
				right = mid - 1;

			if (left > right)
				break;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 99, 88, 77, 66, 55, 44, 33, 22, 11 };
		Scanner sc = new Scanner(System.in);
		int o;
		do {
			System.out.println("Choose Option");
			o = sc.nextInt();
			System.out.println("Enter the value to be searched");
			int key = sc.nextInt();
			int index = binarySearch(arr, key);
			System.out.println(index);
		} while (o == 0);
	}

}
