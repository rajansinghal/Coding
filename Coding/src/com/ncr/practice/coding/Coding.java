package com.ncr.practice.coding;

public class Coding {

	public static String test="welcome to coding algorithms";
	                          
	public static void main(String arr[]){
		
		char array[]= test.toCharArray();
		int len=array.length-1;
		for(int i=0; i<array.length/2;i++){
				char temp=array[len-i];
				array[len-i]=array[i];
				array[i]=temp;
		}
		//System.out.println(new String(array));
		int startindex=0;
		int endindex=0;
		for(int i=0; i<array.length;i++){
			
			
			if(array[i] == ' '){
				
				endindex=i-1;
				System.out.println("startindex :: " + startindex + "  endindex :: " + endindex);
				int k=endindex-startindex;
				
				for( int j=0; j<=k/2; j++){
					
					char temp=array[endindex-j];
					array[endindex-j]=array[startindex];
					array[startindex]=temp;
					
					startindex++;
				}
				
				System.out.println(new String(array));
				startindex=i+1;
			}
		
		}
	
	}
	
	
	
}
