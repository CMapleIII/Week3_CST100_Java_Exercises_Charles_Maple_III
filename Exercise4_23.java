/** Program: Financial application: payroll
* File: Exercise4_23.java
* Summary: A program that reads information 
* and prints a payroll statement.
* Author: Charles Maple III
* Date: July 7, 2016 
**/

/*
 * Employee’s name (e.g., Smith)
 * Number of hours worked in a week (e.g., 10)
 * Hourly pay rate (e.g., 9.75)
 * Federal tax withholding rate (e.g., 20%)
 * State tax withholding rate (e.g., 9%)
 */

import java.util.Scanner;

public class Exercise4_23 
{
	private static Scanner input;
	private static String name;				//Employees Name
	private static double payRate;			//Employee's Hourly Pay Rate
	private static double hoursWeek;		//Employee's Hours Worked in a Week
	private static double fedTax;			//Employee's Federal Tax Withheld
	private static double stateTax;			//Employee's State Tax Withheld

	public static void main(String[] args)
	{
		input = new Scanner(System.in);
		
		System.out.print("Enter Employee's Name:\t");
		name = input.nextLine();
		
		System.out.print("Number of hours employee worked:\t");
		hoursWeek = input.nextDouble();
		
		System.out.print("Enter Employees payrate:\t");
		payRate = input.nextDouble();
		
		System.out.print("Enter Federal Tax Withholding rate (E.G. .20):\t");
		fedTax = input.nextDouble();
		
		System.out.print("Enter State Tax Withholding Rate (E.G. .09):\t");
		stateTax = input.nextDouble();
		
		System.out.println("Employee Name:\t" + name);
		
		System.out.println("Hours Worked:\t" + hoursWeek);
		
		System.out.println("Pay Rate:\t$" + payRate);
		
		System.out.println("Gross Pay:\t$" + payRate * hoursWeek);
		
		System.out.println("Deduction:");
		
		System.out.printf("Federal Withholding (%.1f%%): $%.2f\n", 
				fedTax, fedTax * payRate * hoursWeek);
		
		System.out.printf("State Withholding (%.1f%%): $%.2f\n", 
				stateTax, stateTax * payRate * hoursWeek);
		
		System.out.printf("Total Deduction: $%.2f\n",(stateTax + fedTax) 
				* payRate * hoursWeek);
		
		System.out.printf("Net Pay: $%.2f\n",  (1 - stateTax - fedTax) 
				* payRate * hoursWeek);
		
	}
}
