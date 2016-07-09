/** Program: String permutation
* File: Exercise18_10.java
* Summary: Write a recursive method to 
* print all the permutations of a string.
* Author: Charles Maple III
* Date: July 9, 2016 
**/

import java.util.Scanner;

public class Exercise18_25 
{
	public static void main(String[] args)
	{
		System.out.print("Enter a string:\t");
		String s = new Scanner(System.in).next();
		System.out.println("All permutations of " + s + " are: ");
		
		dispPermut(s);
	}
	
	public static void dispPermut(String s)
	{
		dispPermut("", s);
	}
	
	public static void dispPermut(String s1, String s2)
	{
		if(s2.length() == 0)
		{
			System.out.println(s1);
		}
		else
		{
			for(int i = 0; i < s2.length(); i++)
			{
				dispPermut(s1 + s2.charAt(i), s2.substring(0, i) + s2.substring(i + 1 ));
			}
		}
	}
}
