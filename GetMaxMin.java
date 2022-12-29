package com.vvc.arraypractice;

public class GetMaxMin {

	public static void main(String[] args) {
		// Getting maximum & minimum values from array....
		int a[]= {30,50,90,70,80};
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{ 
				max=a[i];
				
			}
		}
		System.out.println("Maximum Value of a given Array >>" +max );
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			
		}
		System.out.println("Minimum Value of a given Array >> " + min );
		
		
		
	}

}
