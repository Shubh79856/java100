package com.hundredPrograms;

import java.awt.Checkbox;

public class PrimeNum {

	public static void main(String[] args) {
		// NUmber should be greater than 1
		// Divisible by 1 or itself
		// Prime number will have only two factors 
		
		/*
		 * int num = 8; int count=0;
		 * 
		 * if(num>1) { for(int i=1;i<=num;i++) { if(num%i==0) { count ++; }
		 * 
		 * } if(count==2) { System.out.println(num + " : is the prime number"); } else {
		 * System.out.println(num + " : is not the prime number"); } } else {
		 * System.out.println("Not a prime number"); }
		 */
		
		PrimeNum pm= new PrimeNum();
		pm.checkPrimeNum(7);
		
		
	}
	
	public void checkPrimeNum(int x)
	{
		int count =0;
		if(x>1)
		{
			for(int i=1; i<=x;i++)
			{
				if(x%i==0)
				{
					count++;
				}
				
			}
			if(count==2)
			{
				System.out.println(x + " : is the prime number");
			}else
			{
				System.out.println(x + " : is not the prime number");
				
			}
			
		}
		else
		{
			System.out.println("Invalid argument Number is less than 1");
		}
	}
}
