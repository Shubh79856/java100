package com.hundredPrograms;

public class FibonacciSeries {

	// 0,1,1,2,3,,5,8,13,21..........
	public void printFibo()
	{
		int a=0; int b=1;
		
		for(int i=1;i<10;i++)
		{
			System.out.print(a+ " ");
			int sum = a+b;
			a=b;
			b=sum;
		}
		
	}
	
	public static void main(String[] args) {
		
		FibonacciSeries fb = new FibonacciSeries();
		fb.printFibo();
	}
}
