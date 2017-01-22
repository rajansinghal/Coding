package com.ncr.practice.coding;

public class SortingNarrayUsingMergeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] i1={2,6,10,14};
		int[] i2={1,5,9,13};
		int[] i3={0,4,8,12};
		int[] i4={3,7,11,15};
		int[][] ii= new int[4][];
		ii[0] = i1;
		ii[1] = i2;
		ii[2] = i3;
		ii[3] = i4;
		
		SortingNarrayUsingMergeSort s=new SortingNarrayUsingMergeSort();
		int[] comp = new int[0];
		
		for(int j=0;j< ii.length;j++){
			
				comp=s.mergeArray(comp,ii[j]);
		}
		for(int j:comp)
			System.out.println(j);
	}
	
	public int[] mergeArray(int[] arr1, int[] arr2){
		
		int[] sortedarray= new int[arr1.length + arr2.length];
		int k = 0,l=0;
		for(int i=0; i<sortedarray.length; i++){
			
			
			if( k >= arr1.length || ( l < arr2.length && arr1[k] > arr2[l] ) ){
					
				sortedarray[i]=arr2[l];
				l++;
			}
			else if(l >= arr2.length  ||( k < arr1.length && arr1[k] < arr2[l] )){
				sortedarray[i]=arr1[k];
				k++;
			}
		
			
		}
		
		return sortedarray;
	}

}
