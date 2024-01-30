package com.hundredPrograms;

public class ReverseString {

	public void reverseString(String str)
	{
		int len=str.length()-1;
		for(int i=len ; i>=0 ;i--)
		{
			System.out.print(str.charAt(i));
		}
		
		
	}
	
	public static void main(String[] args) {
		
		ReverseString rs = new ReverseString();
		rs.reverseString("My Name is Shubham Srivastava");
	}
}
