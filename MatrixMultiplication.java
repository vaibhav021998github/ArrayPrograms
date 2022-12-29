package com.vvc.arraypractice;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// multiplication of two matrices 
		int a[][]=new int[2][2];
		int b[][]=new int[2][2];
		int ans[][]=new int[2][2];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a Matrix ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				a[i][j]=sc.nextInt();
			}
			
		}
		System.out.println("Enter the b Matrix");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				b[i][j]=sc.nextInt();
			}
			
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{ 
				ans[i][j]=0;
				for(int k=0;k<b.length;k++)
				{ 
					ans[i][j]=ans [i][j] +a [i][k] * b [k][j];	
				}
			}
				
		}
		System.out.println("Multiplication Rersult is ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{ 
				
			System.out.print(ans[i][j]+"\t");		
			
			}
			System.out.println();	
		}
		
		}
	
	}


