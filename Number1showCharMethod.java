import java.util.Scanner;

public class Number1showCharMethod 
{
	public static String showChar(String userStr, int userInt)
	{
		String str = userStr;
		int i = userInt;
		if(str.charAt(i) == ' ')   
			return "a space";					
		return Character.toString(str.charAt(i));		
	}
	public static void main (String [ ] args)
	{
		int userInt;
		String userStr;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string and a number position in the string.");
		userStr = sc.nextLine();
		userInt = sc.nextInt();
		System.out.printf("The character at %d is %s.",userInt ,showChar(userStr, userInt));
		sc.close();
	}
}
