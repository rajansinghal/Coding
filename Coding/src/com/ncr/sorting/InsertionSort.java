package com.ncr.sorting;

public class InsertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] in={25,17,31,13,2};
		new InsertionSort().insertionSort(in);
	}

	
	public void insertionSort(int[] in){
		
		for(int i=1;i < in.length;i++){
			
			for(int j=0;j<i;j++){
				
				if(in[j] > in[i]){
					int temp= in[j];
					in[j]=in[i];
					int k=0;
					for(k=i;k>j;k--){
						int m=k-1;
						in[k]=in[m];
						//in[k+1]=in[k];
						
					}
					in[k+1]=temp;
				}
				
			}
			System.out.println("---------------------------------------------------");
			for(int z:in)
				System.out.println(z);
		}
		
	}
}
