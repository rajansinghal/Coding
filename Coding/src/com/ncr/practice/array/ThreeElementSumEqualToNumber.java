package com.ncr.practice.array;

import java.util.HashMap;
import java.util.Map;

public class ThreeElementSumEqualToNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] in_arr= {2, 4,6,7,8,10,12,13,17,19,21,22,23};
			new ThreeElementSumEqualToNumber().threeDigitWhoseSumEqualToDigit(in_arr, 33);
	}

	public void threeDigitWhoseSumEqualToDigit(int[] in_arr, int sum){
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		String result = "";
		for(int in:in_arr){
			map.put(in, in);
		}
		for(int i=0;i<in_arr.length;i++){
			int sum2=sum-map.get(in_arr[i]);
			for(int j=i+1;j<in_arr.length;j++){
				
				if(map.get(sum2-map.get(in_arr[j])) !=null){
					 result += in_arr[i] + "," + in_arr[j] + "," + (sum2-map.get(in_arr[j])) + ";";
				}
				
			}
			
			
		}
		System.out.println(result);
	}
	
}
