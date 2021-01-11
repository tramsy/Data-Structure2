package com.datastructure;

public class Patterns 
{

	public static void main(String[] args) 
	{
		String zero = "0";
		String one = "1";
		String combo = "01";
		for(int i=1; i<5; i++)
		{
			for(int j=0; j<i; j++)
			{
				if(i>1)
					if(j==i-1)
						System.out.print(i);
					else
						System.out.print(i+ "*");
				else
					System.out.print(i);
			}
			System.out.println("");
		}
		
		System.out.println("\n");
		//question 2 
		
		for(int i = 1; i < 6; i++)
		{
			for(int j=1; j <= i; j++)
			{
				if(j%2==0)
					System.out.print(zero);
				else
					System.out.print(one);
				
			}
			System.out.println("");
		}
		
	}

}
