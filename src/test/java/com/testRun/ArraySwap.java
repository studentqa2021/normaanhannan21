package com.testRun;

import java.util.Arrays;

public class ArraySwap {

	public void getSwap(int a, int b) {

		System.out.println("A value before swap = " +a);
		System.out.println("B value before swap = " +b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("A value after swap = " +a);
		System.out.println("B value after swap = " +b);

	}

	public static void main(String[] args) {

		ArraySwap obj = new ArraySwap();

		obj.getSwap(10, 20);

	}

}
