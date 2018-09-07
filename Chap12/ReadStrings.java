//Filename: ReadStrings
//Written by: Brandon Truong
//Written on: 04/20/2015
import java.util.Scanner;
public class ReadStrings
{

	public static void main(String[] args) 
	{
		String phrase;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter strings, enter DONE when finished: ");
		
		do
		{
			phrase = input.nextLine();

			try
			{
				
				if(phrase.length() > 20)
					{
						throw(new StringTooLongException());
					}
				
//				StringTooLongException hello = new StringTooLongException(phrase);
				
//				System.out.print("You entered: " + phrase);
				System.out.println("You entered " + phrase);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
	
		} while(!phrase.equals("Done") && !phrase.equals("done"));	
	}
}