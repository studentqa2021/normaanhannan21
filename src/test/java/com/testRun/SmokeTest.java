package com.testRun;

import com.testRun.JavaCollectionPractice;

public class SmokeTest {

	public static void main(String[] args) {

		int[] myArray = { 2, 5, 3, 3, 4, 5, 6, 6, 4 };

		JavaCollectionPractice obj = new JavaCollectionPractice();
		obj.getDuplicate(myArray);
	}

}
