package com.hundredPrograms;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomNums {

	//1. We can use built in Random class
	public void generateRandomNumbers()
	{
		Random random= new Random();
		int ranNum = random.nextInt(100);
		System.out.println(ranNum);
		
	}
	
	public static void main(String[] args) {
		
		GenerateRandomNums gn = new GenerateRandomNums();
		gn.generateRandomNumbers();
		gn.createRandomUsingMath();
		gn.createRandomString();
	}
	
	//2. Using Math Class]
	
	public void createRandomUsingMath()
	{
		double random = Math.random();
		
		System.out.println(random);
	}
	
	//3. Using Apache Common Lan API dependency from Maven Repo
	
	public void createRandomString()
	{
		String randomString = RandomStringUtils.randomAlphabetic(5);
		System.out.println(randomString);
	}
}
