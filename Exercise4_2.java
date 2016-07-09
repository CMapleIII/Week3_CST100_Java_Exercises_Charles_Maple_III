/** Program: Geometry: Great circle distance
* File: Exercise4_2.java
* Summary: Prompts the user to enter the 
* latitude and longitude of two points on 
* the earth in degrees and displays its 
* great circle distance.
* Author: Charles Maple III
* Date: July 5, 2016 
**/

import java.util.Scanner;

public class Exercise4_2 
{
	private static Scanner input;

	public static void main(String[] args)
	{
		input = new Scanner(System.in);
		
		System.out.print("Enter the side:\t");
		
		System.out.print("Enter point 1 Lattitude and Longitude:\t");
		
		double x1 = Math.toRadians(input.nextDouble());
		double y1 = Math.toRadians(input.nextDouble());
		
		System.out.print("Enter point 2 Lattitude and Longitude:\t");
		
		double x2 = Math.toRadians(input.nextDouble());
		double y2 = Math.toRadians(input.nextDouble());
		
		double distance = 6371.01 * Math.acos(Math.sin(x1) 
				* Math.sin(x2) + Math.cos(x1) * Math.cos(x2) 
				* Math.cos(y1 - y2));
		
		System.out.println("The distance between the points is:" + distance + "km");
	}
}
