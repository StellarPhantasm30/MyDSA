package com.practice;

import java.math.BigInteger;
import java.util.ArrayList;

public class FactorialMT {

	private static class MyThread extends Thread {

		private int num;
		private BigInteger result;

		MyThread(int num) {
			this.num = num;
			this.result = BigInteger.ONE;
		}

		@Override
		public void run() {

			System.out.println("Inside thread : " + currentThread().getName() + " , num = " + this.num);
			factorial();
		}

		public void factorial() {
			for (int i = 2; i < this.num; i++) {
				this.result = this.result.multiply(BigInteger.valueOf(i));
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(2);
		nums.add(3);
		nums.add(5);
		nums.add(6);

		int result = nums.stream().filter(a -> a % 2 == 1).map(x -> x * x).reduce((a, b) -> a + b).get();

	}

}
