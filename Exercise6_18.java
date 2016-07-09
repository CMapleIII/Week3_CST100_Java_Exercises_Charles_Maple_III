/** Program: Check Password
* File: Exercise6_18.java
* Summary: Checks whether a 
* string is a valid password.
* Author: Charles Maple III
* Date: July 8, 2016 
**/

import java.util.Scanner;

public class Exercise6_18 
{
	private static Scanner input;
	private static String s;

	public static void main(String[] args)
	{
		input = new Scanner(System.in);
		
		System.out.print("Enter Password: ");
		
		s = input.nextLine();
		
		if(checkPsswrd(s))
		{
			System.out.println("Correct Password");
		}
		else
		{
			System.out.println("Incorrect Password");
		}
	}
	
	public static boolean checkPsswrd(String password)
	{
		boolean checkPsswrd = true;
		
		if(password.length() < 8)
		{
			checkPsswrd = false;
		}
		else
		{
			int numofDigits = 0;
			for(int i = 0; i < password.length(); i++)
			{
				if(isDigit(password.charAt(i)) || isLetter(password.charAt(i)))
				{
					if(isDigit(password.charAt(i)))
					{
						numofDigits++;
					}
				}
			else
			{
				checkPsswrd = false;
				break;
			}
		}
		
		if(numofDigits < 2)
		{
			checkPsswrd = false;
		}
	}
	
	return checkPsswrd;
}

	public static boolean isLetter(char ch)
	{
		return ((ch <= 'z' && ch >= 'a') || (ch <= 'Z' && ch >= 'A'));
	}	

	public static boolean isDigit(char ch)
	{
		return (ch <= '9' && ch >= '0');
	}
}