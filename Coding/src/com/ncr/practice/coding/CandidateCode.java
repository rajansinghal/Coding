package com.ncr.practice.coding;

public class CandidateCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] i={10,22,9,33,21,50,41,60,80};
		int[] i={0,8,4,12,2,10,6,14,1,9,5,13,3,11,7,15};
		System.out.println(longestSeq(i));
	}

	
	 public static int longestSeq(int[] input1)
	    {
		 /*	int[] j=new int[input1.length];*/
		  StringBuilder op=null;
		 
		  if(input1.length > 0){
			  op = new StringBuilder(String.valueOf(input1[0]).toString());
			  int current=input1[0];
			  for(int i=1; i<input1.length;i++){
				 
				if(input1[i] > current){
					op.append("," + input1[i]);
					current=input1[i];
				}
			 }
		  }
		  System.out.println(op.toString());
		  return op.toString().split(",").length;
		  
	    }
}
