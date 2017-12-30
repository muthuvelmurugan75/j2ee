package com.originallist.www;

public class second_minimum_number {
	public static void main(String[] args) 
	{
		 int[] a = {2,3,5,7,8,0,1};
		    int smallest = 0;
		    int secondSmallest = 0;
		    for (int i = 0; i < a.length; i++) 
		    {
		        if(a[i]==smallest)
		        {
		          secondSmallest=smallest;
		        } 
		        else if (a[i] < smallest) 
		        {
		            secondSmallest = smallest;
		            smallest = a[i];
		        } 
		        else if (a[i] < secondSmallest) 
		        {
		            secondSmallest = a[i];
		        }

		    }
		    System.out.println(secondSmallest);
	}
}



