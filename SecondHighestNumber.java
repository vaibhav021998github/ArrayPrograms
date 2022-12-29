package com.vvc.arraypractice;

import java.util.Arrays;

public class SecondHighestNumber {

	public static void main(String[] args) {
		// To Find the Second Highest No. in an Array
		//logic No.1.
		/*	int a[]= {11,17,25,18,26,51,101};
		int n=a.length;
		Arrays.sort(a);
		System.out.println("Second Highest Number of Array >> "+a[n-2]);*/
				
		//Logic No.2
		/*int a[]= {11,17,25,18,26,51,101}; // Array unsorted
		int n=a.length;
		int highest=Integer.MIN_VALUE;
		int secondHighest=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) //traversing an array
		{
			if(a[i]>highest) //17>11
			{
				secondHighest=highest;
				highest=a[i];
			}
			if(a [i] >highest && a[i] > secondHighest)
			{
				secondHighest=a[i];
			}
			
		}
			System.out.println("Second Highest Number of Array >> "+secondHighest);*/  
	}

}
