/** Program: Occurrences of a specified character in an array
* File: Exercise18_10.java
* Summary: Write a test program that prompts the user to 
* enter a list of characters in one line, and a character, 
* and displays the number of occurrences of the character 
* in the list.
* Author: Charles Maple III
* Date: July 9, 2016 
**/

import java.util.Scanner;

public class Exercise18_17 
{
	private static Scanner input;
	private static String s;
	private static char ch;
	
	public static void main(String[] args)
	{
		input = new Scanner(System.in);
		
		System.out.print("Input a list of characters in one line.");
		
		s = input.nextLine();
		
		System.out.print("Input a character:\t");
		
		ch = input.next().charAt(0);
		
		char[] chars = s.replaceAll(" ",  " ").toCharArray();
		
		System.out.println("The occurrences of '" + ch + "' in \"" + s + "\" = " + count(chars, ch));
	}
	
	private static int count(char[] chars, char ch)
	{
		return count(chars, ch, chars.length - 1);
	}
	
	private static int count(char[] chars, char ch, int high)
	{
		int count = (chars[high] == ch) ? 1 : 0;
		
		if(high == 0)
			return count;
		else
			return count + count(chars, ch, high - 1);
	}
}
