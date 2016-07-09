/** Program: Print the Characters in a String Reversely
* File: Exercise18_9.java
* Summary: Prompts the user to 
* enter a string and displays 
* its reversal.
* Author: Charles Maple III
* Date: July 9, 2016 
**/

import java.util.Scanner;

public class Exercise18_9 
{
	private static String value;

	public static void main(String[] args)
	{
		System.out.print("Input a String:\t");
		
		value = new Scanner(System.in).nextLine();
		
		reverseInput(value);
	}
	
	private static void reverseInput(String value)
	{
		if (value.length() == 0)
			return;
		
		System.out.print(value.substring(value.length() - 1));
		reverseInput(value.substring(0, value.length() - 1));
	}
}
