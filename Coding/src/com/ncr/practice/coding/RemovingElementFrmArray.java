package com.ncr.practice.coding;

public class RemovingElementFrmArray {

	public static void main(String arr[]) {
		int[] a = new int[] { 1, 2, 3, 4, 5, 6, 7,8,9 };
		new RemovingElementFrmArray().removeElementO_n(a, 5);
	}

	public void removeElementO_n(int[] a, int element) {
		int startPtr = 0;
		int endPtr = a.length - 1;
		// {1,4,2,4,3,5,4,4};
		while (startPtr < endPtr) {
			while (endPtr > 0 && a[endPtr] == element) {
				a[endPtr] = -1;
				endPtr--;
			}

			while (startPtr < a.length && a[startPtr] != element) {
				startPtr++;
			}

			if (startPtr < endPtr) {
				a[startPtr] = a[endPtr];
				a[endPtr] = -1;
				startPtr++;
				endPtr--;
			}
		}
		for(int i:a){
			
			System.out.println(i + " ");
		}
	}

}