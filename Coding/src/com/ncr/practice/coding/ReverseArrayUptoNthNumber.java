package com.ncr.practice.coding;

public class ReverseArrayUptoNthNumber {

	public static void main(String arr[]) {
		int[] a = new int[] { 1, 2, 3, 4, 5, 6 };
		int num = 3;

		for (int j : new ReverseArrayUptoNthNumber().reverseMethod(a, num)) {

			System.out.println(j);
		}
	}
	public int[] reverseMethod(int[] a, int num) {

		for (int i = 0; i < a.length; i++) {
			if (a[i] == num) {
				int len=(i)/2;
				for (int k = 0; k <= len; k++) {
					int temp=a[i];
					a[i]=a[k];
					a[k]=temp;
					i--;
				}
				break;
			}
		}
		return a;
	}
}
