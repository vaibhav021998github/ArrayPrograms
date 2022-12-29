package com.vvc.arraypractice;

public class FindNumber {

	public static void main(String[] args) {
		// Q.2. Write a program to find whether the given integer is present in an array or not.....  

	int a[]= {11,13,17,19,23};   //array creation , declaration & initialization....
		int num=13;
		boolean duplicatePresent=false;
		for(int element:a)  		//for each loop
		{
			if(num==element)
			{ 
				 duplicatePresent=true;
				 break;
			}
			
		}
		if(duplicatePresent) 
		
			System.out.println("Duplicate Number is present in an Array");
		
		else
			
			System.out.println("Duplicate Number Not found in an Array");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}

}
