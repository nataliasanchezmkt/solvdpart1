package com.solvd.laba;

public class BubbleSort {

	static void bubbleAscending(int[] myarray) {
		int n = myarray.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (myarray[j - 1] > myarray[j]) {
					// Code to swap the elements
					temp = myarray[j - 1];
					myarray[j - 1] = myarray[j];
					myarray[j] = temp;
				}
			}
		}

	}

	public static void main(String[] args) {
		int myarray[] = { 4, 5, 2, 1, 3, 6, 7, 8 };

		System.out.println("Array on which we apply Bubble Sort: ");
		for (int i = 0; i < myarray.length; i++) {
			System.out.print(myarray[i] + " ");
		}
		System.out.println();

		bubbleAscending(myarray);

		System.out.println("Array after applying Bubble Sort: ");
		for (int i = 0; i < myarray.length; i++) {
			System.out.print(myarray[i] + " ");
		}
	}
}
