/** Program: Display Characters
* File: Exercise6_12.java
* Summary: Prints the characters 
* between ch1 and ch2 with the 
* specified numbers per line.
* Author: Charles Maple III
* Date: July 8, 2016 
**/

public class Exercise6_12 
{
	private static int numPrinted;

	public static void main(String[] args)
	{
		charPrint('1', 'Z', 10);
	}
	
	public static void charPrint(char char1, char char2, int numperLine)
	{
		numPrinted = 0;
		
		for (; char1 <= char2; char1++)
		{
			System.out.print(char1 + "");
			numPrinted++;
			
			if (numPrinted % numperLine == 0)
			{
				System.out.println();
			}
		}
	}
}
