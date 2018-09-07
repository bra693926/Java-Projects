//Filename:OutOfBoundsException
//Written by: Brandon Truong
//Written on: 04/20/2015

import java.util.Scanner;
public class OutOfBoundsException 
{

	public static void main(String[] args) 
	{
		int hey;
		String[] courses = {"Java 1","Java 2","VB","C#","JavaScript"};
		
		Scanner input = new Scanner(System.in);
		
		try
		{
			
			System.out.print("Enter an integar, "
					+ "and I will diaplay a course: ");
			hey = input.nextInt();
			
			System.out.println("Course is " + courses[hey]);
		}
		catch(ArrayIndexOutOfBoundsException hello)
		{
			
			System.out.print("Subscript out of range.");
		}
		

	}

}
