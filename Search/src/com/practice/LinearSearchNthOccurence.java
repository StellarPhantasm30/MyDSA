package com.practice;

import java.util.Scanner;

public class LinearSearchNthOccurence {

	public static int linearSearch(int[] arr, int key, int n) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				count++;
				if (count == n) {
					return i;
				}
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 88, 33, 66, 99, 11, 77, 22, 55, 11 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value to be searched");
		int key = sc.nextInt();
		System.out.println("Enter the occurence value");
		int n = sc.nextInt();
		int index = linearSearch(arr, key, n);
		System.out.println(index);
	}

}
