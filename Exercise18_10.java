/** Program: Occurrences of a specified character in a string
* File: Exercise18_10.java
* Summary: prompts the user to enter a string 
* and a character, and displays the number of 
* occurrences for the character in the string.
* Author: Charles Maple III
* Date: July 9, 2016 
**/

import java.util.Scanner;

public class Exercise18_10 
{
	private static Scanner input;

	public static void main(String[] args)
	{
		input = new Scanner(System.in);
		
		System.out.print("Input a String:\t");
		
		String strng = input.next();
		
		char ch = input.next().charAt(0);
		
		System.out.println(count(strng, ch));
	}
	
	public static int count(String s, char ch)
	{
		int n = (ch == s.charAt(0)) ? 1 : 0;
		if (s.length() == 1)
			return n;
		else
			return n + count(s.substring(1), ch);
	}
}
