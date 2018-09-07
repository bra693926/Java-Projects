//Filename: NameLength
//Written by: Brandon Truong
//Written on: March 16, 2015

import java.util.Scanner;
public class NameLength 
{

	public static void main(String[] args) 
	{
		
		String lengthFirst;
		String lengthLast; 
		int fullcount;
		int firstcount;
		int lastcount;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your first name: ");
		lengthFirst = input.nextLine();
		firstcount = lengthFirst.length(); 
		
		System.out.print("Enter your last name: ");
		lengthLast = input.nextLine();
		lastcount = lengthLast.length();
		
		fullcount= firstcount + lastcount;
		
		System.out.println("Name: " + lengthFirst + " " + lengthLast);
		System.out.println("Number of characters in your name: " + fullcount);
		
	}

}
