package com.practice;

import java.util.Scanner;

public class LinearSearch {

	public static int linearSearch(int[] arr, int key) {

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == key)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 88, 33, 66, 99, 11, 77, 22, 55, 11 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value to be  found");
		int key = sc.nextInt();
		int index = linearSearch(arr, key);
		System.out.println(index);

	}

}
