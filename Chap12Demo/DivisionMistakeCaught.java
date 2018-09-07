import java.util.InputMismatchException;
import java.util.Scanner;
public class DivisionMistakeCaught //this file is to show exception errors
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int num, den, result;
		
//		System.out.print("Enter numerator >> ");
//		num = input.nextInt();
		
//		System.out.print("Enter denominator >> ");
//		den = input.nextInt();
		
		try
		{
			
			System.out.print("Enter numerator >> ");
			num = input.nextInt();
			
			System.out.print("Enter denominator >> ");
			den = input.nextInt();
			
			result = num / den;
			System.out.println(num + "/" + den + "=" + result);
			
		}
		catch(ArithmeticException mistake) //mistake can be called anything.. like error
		{
//			System.out.println(Attempt to divide by zero");
			System.out.println(mistake.getMessage());
		}
		catch(InputMismatchException mistake)
		{
			System.out.println("Wrong data type");
		}

	}

}
