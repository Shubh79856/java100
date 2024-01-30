package com.hundredPrograms;

/**
 * 
 * @author thesr SWAPING two numbers using 5 methods
 */
public class SWAP2Nums {

	public void swapUsing3rdVariable(int a, int b, int c) {
		
		System.out.println("Initial Value of a & b before swap are : " + a + " & " + b);
		c = a;
		a = b;
		b = c;
		System.out.println("Final Value of a & b after swapping are : " + a + " & " + b);

	}
	
	public void swapWithout3rdVariable(int a, int b)
	{
		
		System.out.println("Initial Value of a & b before swap are : " + a + " & " + b);
		
//		b=b+a;
//		a=b-a;
//		b=b-a;
		a = a+b; //50
		b=a-b; //20
		a=a-b;
		
		
		System.out.println("Final Value of a & b after swapping are : " + a + " & " + b);
	}
	
	public void swapUsingDivide(int a, int b)
	{
		System.out.println("Initial Value of a & b before swap are : " + a + " & " + b);
		
		a = a*b; // 600
		b = a/b; //20
		a = a/b ; //30
		
		System.out.println("Final Value of a & b after swapping are : " + a + " & " + b);
	}
	

	public static void main(String[] args) {

		SWAP2Nums swap = new SWAP2Nums();
		swap.swapUsing3rdVariable(5, 10, 0);
		
		swap.swapWithout3rdVariable(20,30);
		
		swap.swapUsingDivide(20,30);
	}
	
}
