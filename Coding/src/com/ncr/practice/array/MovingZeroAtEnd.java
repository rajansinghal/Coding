package com.ncr.practice.array;


//expedia 
public class MovingZeroAtEnd {

	
	public static void main(String arr[]){
		moveZero(2307046); //out put should be : 2374600
	}
	
	public static void moveZero(int z){
		
		int y=1;
		int q = z;
		int d = 0;
		while(q != 0){
			
			y =y*10;
			q=z/y;
			d=z%y;
			
			if(q%10 == 0){
				q=q*y;
				d=d*10;
				z= q+ d;
			}
			
		}
		System.out.println("output :: " + z/10);
		
	}
}
