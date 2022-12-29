package com.vvc.arraypractice;

public class ReverseArray {

	public static void main(String[] args) {
		//Q. To Reverse the Array
		int a[]=new int[] {1,2,3,4,5};
		System.out.println("Original Array");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Revese Array");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	}

}
