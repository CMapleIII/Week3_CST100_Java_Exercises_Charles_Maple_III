/** Program: Palindrome integer
* File: Exercise6_3.java
* Summary:Prompts the user to enter 
* an integer and reports whether 
* the integer is a palindrome.
* Author: Charles Maple III
* Date: July 7, 2016 
**/

import java.util.Scanner;

public class Exercise6_3 
{
	private static Scanner input;
	private static int number;

	public static void main(String[] args)
	{
		input = new Scanner(System.in);
		
		System.out.print("Enter an Integer:\t");
		
		number = input.nextInt();
		
		if(isPalindrome(number))
		{
			System.out.print(number + " is a palendrome.");
		}
		else
		{
			System.out.print(number + " is not a palendrome.");
		}
	}
	
	public static int reverse(int number)
	{
		int reverse = 0;
		int digit;
		
		do
		{
			digit = number % 10;
			reverse = reverse * 10 + digit;
			number /= 10;
		}
		
		while (number != 0);
		return reverse;
	}
	public static boolean isPalindrome(int number)
	{
		return (number == reverse(number));
	}
}
