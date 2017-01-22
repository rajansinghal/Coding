package com.ncr.practice.coding;

public class RemovingElementFrmArray_BruteForce {

	public static void main(String arr[]) {
		int[] a = new int[] {1,4,2,4,3,5,4,4};
		new RemovingElementFrmArray_BruteForce().removeElementO_n(a, 4);
	}

	public void removeElementO_n(int[] a, int element) {
        int ct=0;
        int ln = a.length;
        //{1,4,2,4,3,5,4,4};
        for (int i = 0; i < a.length; i++) {
            if(a[i] == element) {
                ct++;
                for (int j = i; j < a.length; j++) {
                    if((j+1)<a.length) {
                        a[j] = a[j+1];
                    }
                }
                a[ln-ct] = -1;
            }
        } 
        for(int aa: a)
        	System.out.println(aa + ",");
    }
}