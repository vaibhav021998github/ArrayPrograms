package com.vvc.arraypractice;

import java.util.Scanner;

public class AddSubOfArray {

	public static void main(String[] args) {
		// Q.4. Addition of Two matrices....
		int [][]mat1=new int [2][2];
						
		int [][]mat2=new int[2][2];
		int [][]result=new int[2][2];
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Matrix 1");
		for(int i=0;i<mat1.length;i++)
		{
			for(int j=0;j<mat1[i].length;j++)
			{ 
				mat1[i][j]=input.nextInt();
			}
		}
		System.out.println("Enter the Matrix 2");
		for(int i=0;i<mat1.length;i++)
		{
			for(int j=0;j<mat1[i].length;j++)
			{ 
				mat2[i][j]=input.nextInt();
	
			}
			
		}
		System.out.println("Addition...");
		
	for(int i=0;i<mat1.length;i++) // for rows ...
	{
			for(int j=0;j<mat2.length;j++) //for column...
			{
			result[i][j]=mat1[i][j]+mat2[i][j];	// for matrix Addition
			System.out.print(result[i][j]+"\t");
			} 
			System.out.println();
	}
	
	System.out.println("SubStraction...");
	
	for(int i=0;i<mat1.length;i++)    //for rows...
	{
			for(int j=0;j<mat2.length;j++)  // for column...
			{
			result[i][j]=mat1[i][j]-mat2[i][j];	// matrix Substraction...
			System.out.print(result[i][j]+"\t");
			} 
			System.out.println();  // for new line...
	}
	
	}

}
