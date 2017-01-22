package com.ncr.practice.coding;

public class RemovingElementFrmArray1 {

	public static void main(String arr[]) {
		int[] a = new int[] { 1, 2, 3, 4, 5, 6, 7,8,9 };
		new RemovingElementFrmArray1().removeElementO_n(a, 5);
	}

	public void removeElementO_n(int[] a, int element) {
		int j=0;
		for(int i=0;i<a.length;i++){
			if( a[i] != element){
				System.out.println("->"+j);
				a[j++]=a[i];
				System.out.println("->>"+j);
			}
			
		}
		a[a.length-1]= '\0' ;
		for(int k: a)
			System.out.println(k + " ");
	}

}