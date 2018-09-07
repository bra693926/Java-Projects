//Filename: CountWords
//Written by: Brandon Truong
//Written on: 3/23/2015

import java.util.Scanner;
public class CountWords 
{

	public static void main(String[] args) 
	{
		String sentence;
		int wordloopcount = 0; //why need initialize with 0??
		boolean word = false; // boolean declaration for if statement? also why set false??
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string >> ");
		sentence = input.nextLine();
		int end = sentence.length() - 1; //why subtract by 1??
		
		for (int loop = 0; loop < sentence.length(); ++loop) //loop until its !> than sentence length
			{												//how does the loop accept true or false?
			if (Character.isLetter(sentence.charAt(loop)) && loop != end) 
				{
		        word = true;
				}											//doesn't increment, why do we need this?? 
			else if (!Character.isLetter(sentence.charAt(loop)) && word) 
				{
	            wordloopcount++;
	            word = false;
				}
			else if (Character.isLetter(sentence.charAt(loop)) && loop == end) 
			 	{
		        wordloopcount++;
			 	}
			}									//need help with understanding these if statements
		
		System.out.print("There are " + wordloopcount + " words in the string");
		
	}

}
