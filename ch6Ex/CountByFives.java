//Filename: CountByFives
//Written by: Brandon Truong
//Written on: 3/09/2015
public class CountByFives 
{

	public static void main(String[] args) 
	{
		int number = 0;
		
		while (number <= 195)
		{
			if((number % 50) == 0)
			{
				System.out.println();
			}
			number += 5;
			System.out.print(number + " ");
			
		}
	}
}
