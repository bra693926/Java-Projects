//Filename: IntArray
//Written by: Brandon Truong
//Written on: 4/06/2015

import java.util.Scanner;
public class mockCountintegars {	//this file is to show that you cant 
								// declare an array with a number, array[8],
							// if u initialize it with elemetns {3,5,6,...}
						//but u must provide a number for array[8] if u do not
						// have a initializeation list
	public static void main(String[] args) 
	{

		int number;
		int[] array = new int[8];
		Scanner input = new Scanner(System.in);
		
		System.out.print("Type 8 ints");
		for(int x = 0; x < 8; ++x)
		{
			
			number = input.nextInt();
			array[x] = number;
		}
		
		for(int x = 0; x < array.length; ++x)
		{
			System.out.print(array[x] + " ");
			
		}

		System.out.print("\n");
		
		for(int x = array.length - 1; x > -1; --x)	//u can use same variable as above
		{
			System.out.print(array[x] + " ");
			
		}

	}

}
