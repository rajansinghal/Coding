package com.ncr.sorting;

public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] in={25,17,31,13,2};
		new BubbleSort().bubbleSort(in);

	}
	public void bubbleSort(int[] in){
		
		for(int i=1;i <=in.length;i++){
			
			for(int j=0;j < in.length-i;j++){
				int k=j+1;
				if(in[j] > in[k]){
					int temp= in[j];
					in[j]=in[k];
					in[k]=temp;
				}
				
			}
			
		}
		
		for(int z:in)
			System.out.println(z);
		
	}
}
