package com.testRun;

import java.util.Arrays;

public class JavaCollectionPractice {

	public void getDuplicate(int[] myArray) {

		for (int i = 0; i < myArray.length; i++) {
			for (int j = i + 1; j < myArray.length; j++) {
				if (myArray[i] == (myArray[j])) {
					System.out.println("Duplicate Values : " + myArray[j]);

				}

			}
		}

	}
}
