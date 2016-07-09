/** Program: Decimal to Hex
* File: Exercise4_2.java
* Summary:Prompts the user to 
* enter an integer between 0 
* and 15 and displays its 
* corresponding hex number.
* Author: Charles Maple III
* Date: July 6, 2016 
**/

import java.util.Scanner;

public class Exercise4_11 
{
	private static Scanner input;

	public static void main(String[] args)
	{
		System.out.print("Enter decimal value:\t");
		input = new Scanner(System.in);
		int i = input.nextInt();
		
		if (i < 0 || i > 15)
		{
			System.out.print(i + " is an invalid input");
			System.exit(0);
		}
		
		System.out.println("The hex value is " + Integer.toHexString(i).toUpperCase());
		
	}
}
