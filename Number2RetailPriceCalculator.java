import java.util.Scanner;

public class Number2RetailPriceCalculator 
{
	public static double calculateRetail(double whole, double salePercent)
	{
		double wholeSale = whole;
		double percent = salePercent;
		percent = percent / 100 + 1;
		double retail = percent * wholeSale;
		return retail;
	}
	public static void main (String [ ] args)
	{
		double w;
		double p;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter in a whole sale value and an integer percent value between 1 - 100.");
		w = sc.nextDouble();
		p = sc.nextDouble();
		System.out.printf("The retail price is %.2f.",calculateRetail(w,p));
		sc.close();
	}
}
