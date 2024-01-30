package com.hundredPrograms;

public class Factorial {

	public static void main(String[] args) {
		// 5*4*3*2*1
		/*
		 * int num=4; int fact=1; for(int i=num ; i>=1 ;i--) { fact=fact*num; num--; }
		 * System.out.println(fact);
		 */
		
		/*
		 * int num=5; int fact=1;
		 * 
		 * for(int i=1 ;i<=5 ; i++) { fact=fact*num; num--; } System.out.println(fact);
		 */
		
		int num =6; int fact=1;
		
		for(int i=1; i<=5;i++)
		{
			fact = fact*num;
			num--;
			
		}
		System.out.println(fact);
	}

}
