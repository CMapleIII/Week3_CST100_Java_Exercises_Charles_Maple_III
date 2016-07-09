/** Program: Sort 3 numbers
* File: Exercise6_5.java
* Summary:Prompts the user to 
* enter three numbers and invokes 
* the method to display them in 
* increasing order.
* Author: Charles Maple III
* Date: July 7, 2016 
**/

import java.util.Scanner;

public class Exercise6_5 
{
	private static Scanner input;
	private static double num1;
	private static double num2;
	private static double num3;

	public static void main(String[] args)
	{
		input = new Scanner(System.in);
		
		System.out.print("Enter three numbers:\t");
		
		num1 = input.nextDouble();
		num2 = input.nextDouble();
		num3 = input.nextDouble();
		
		displayNumbers(num1, num2, num3);		
	}
	
	public static void displayNumbers(double num1, double num2, double num3)
	{
		if (num3 > num2)
		{
			double temp = num2;
			num2 = num3;
			num3 = temp;
		}
		
		if (num2 > num1)
		{
			double temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		if (num3 > num2)
		{
			double temp = num2;
			num2 = num3;
			num3 = temp;
		}
		
		System.out.println("The numbers in increasing order is " + num3 + " " + num2 + " " + num1);
	}
}
