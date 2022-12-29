package com.vvc.arraypractice;

public class CalculateSum {

	public static void main(String[] args)
	{
		// Q.1 Calculate the Sum of  marks which is in float datatype...
		//Q.3 Calculate the average marks of a given array.... 
		
		float[] marks= {73.5f,71.5f,75.3f,84.6f,82.1f};
		float sum=0;
		for(float element:marks) //for each loop...
		{
			sum=sum+element;   //sum variable ...
		}
		
		System.out.println("Sum of the given marks is  >>  "+sum);
		System.out.println("Average Marks of a given data  >> "+ sum/marks.length);

	}

}
