package com.vvc.arraypractice;

public class EvenOddNumber {

	public static void main(String[] args) {
		// Segregating Even & Odd numbers from the Array
		int a[]={1,2,3,4,5,6};
		System.out.println("Even Number in an Array");
		for(int i=0;i<a.length;i++)
		{ 
			int ans =a[i]%2;
			if(ans==0)
			{
				System.out.print(a[i]+" ");
			}
		}
		System.out.println();
		System.out.println("Odd Number in an Array");
		for(int i=0;i<a.length;i++)
		{ 
			int ans =a[i]%2;
			if(ans!=0)
			{
				System.out.print(a[i]+" ");
			}
		}
	}

}
