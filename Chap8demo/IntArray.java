//Filename: IntArray
//Written by: Brandon Truong
//Written on: 4/06/2015

//import javax.swing.*;
public class IntArray {

	public static void main(String[] args) 
	{
//		int x;
		int[] array = {10, 15, 23, 29, 31, 34, 38, 45};
		//= new int[8]
				
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
