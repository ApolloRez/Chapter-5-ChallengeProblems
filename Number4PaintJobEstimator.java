import java.util.Scanner;

public class Number4PaintJobEstimator 
{
	public static double getGallonsNeeded(double feet)
	{
		double squareFeet = feet;
		double gallonsNeeded = squareFeet / 115;	
		return gallonsNeeded;
	}
	public static void main(String [ ] args)
	{
		double paintPrice = 0;
		int numberOfRooms;
		double squareFeet = 0;
		double totalSquareFeet = 0;
		double totalGallons = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the price of paint per gallon?\n$");
		paintPrice = sc.nextDouble();
		System.out.print("How many rooms need to be painted? ");
		numberOfRooms = sc.nextInt();
		
		for( int i = 1; i <= numberOfRooms; i++)
		{
			System.out.print("How many square feet for room " +i +"?");
			squareFeet = sc.nextDouble();
			totalSquareFeet = totalSquareFeet + squareFeet;
			totalGallons = totalGallons + getGallonsNeeded(squareFeet);
		}
		double totalPaintPrice = totalGallons * paintPrice;
		double totalLaborHours = (totalSquareFeet / 115) * 8;
		double totalLaborCharges = totalLaborHours * 18.00;
		double totalCost = totalLaborCharges + totalPaintPrice;
		System.out.printf("\n%.2f gallons are required for this job.\n\n",totalGallons);
		System.out.printf("$%.2f is the cost of paint for %.2f gallons.\n\n",totalPaintPrice ,totalGallons);
		System.out.printf("%.2f hours of labor are required for this job.\n\n", totalLaborHours);
		System.out.printf("$%.2f is the total labor charges for this job.\n\n", totalLaborCharges);
		System.out.printf("$%.2f is the total cost of the paint job.\n\n", totalCost);
		
		sc.close();
	}
}
/*
A painting company has determined that for every 115 square feet of wall space, 
one gallon of paint and eight hours of labor will be required. 
The company charges $18.00 per hour for labor. 
Write a program that allows the user to enter the number of rooms to be painted and the price of the paint per gallon. 
It should also ask for the square feet of wall space in each room. 
The program should have methods that return the following data: 
	• The number of gallons of paint required 
	• The hours of labor required
	• The cost of the paint 
	• The labor charges 
	• The total cost of the paint job Then it should display the data on the screen.
*/