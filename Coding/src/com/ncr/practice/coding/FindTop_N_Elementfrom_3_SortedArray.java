package com.ncr.practice.coding;

public class FindTop_N_Elementfrom_3_SortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] first={2,22,33,44,56};
		int[] second={3,4,15};
		int[] third={4,5,9,57};
		int[] one,two, three;
		int n =4;
		//24 12 14
		int firstEndPtr=first.length-1, secondEndPtr=second.length-1, thirdEndPtr=third.length-1;
		for(int i= firstEndPtr; i>(firstEndPtr - n) ; i--){
			if(first[i] >= second[secondEndPtr]){
				if(first[i] >= third[thirdEndPtr]){
					System.out.println(first[firstEndPtr]);
					firstEndPtr = firstEndPtr -1;
				}else{
					System.out.println(third[thirdEndPtr]);
					thirdEndPtr = thirdEndPtr -1;
				}
				
			}else{ 
				if(second[secondEndPtr] >= third[thirdEndPtr]){
					System.out.println(second[secondEndPtr]);
					secondEndPtr = secondEndPtr -1 ;
				}else{
					System.out.println(third[thirdEndPtr]);
					thirdEndPtr = thirdEndPtr -1;
				}
			}
		}
			
	}

}
