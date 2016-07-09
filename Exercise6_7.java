/** Program: Financial application: compute the future investment value
* File: Exercise6_7.java
* Summary:computes future 
* investment value at a given 
* interest rate for a specified 
* number of years.
* Author: Charles Maple III
* Date: July 7, 2016 
**/

import java.util.Scanner;

public class Exercise6_7 
{
	private static Scanner input;
	private static double amountInvested;
	private static double interestrateMonthly;

	public static void main(String[] args)
	{
		input = new Scanner(System.in);
		
		System.out.print("Enter Investment Amount:");
		amountInvested = input.nextDouble();
		
		System.out.print("Enter Annual Interest Rate in %:");
		interestrateMonthly = input.nextDouble();
		
		interestrateMonthly = interestrateMonthly / 12;
		
		System.out.println("Years\t Future Value");
		
		for(int i = 0; i < 30; i++)
		{
			System.out.printf("%3d%10.2f\n",  i + 1, futureInvestmentValue(amountInvested,interestrateMonthly, i + 1));
		}
	}
	public static double futureInvestmentValue(double amountInvested, double interestrateMonthly, int years)
	{
		return amountInvested * Math.pow((1 + interestrateMonthly / 100), (years * 12));
	}
}
