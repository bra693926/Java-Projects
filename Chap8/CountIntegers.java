//Filename: CountIntegers
//Written by: Brandon Truong
//Written on: 4/06/2015
import java.util.Scanner;
public class CountIntegers {

	public static void main(String[] args) 
	{

		int x = 0;
		int[] count = new int[51];
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter integers in the range 0-50. \nSignal end of list with a number outside the range. \n\n");
		
		while(x <= 50 && x >= 0)
		{
			
			count[x]++;
			x = input.nextInt();
			System.out.print("\n");
			
		}
		
		System.out.println("Number	Times\n");
		
		for(x = 1; x < count.length - 1; x++)	//there is no 51 so length -1
		{
			if(count[x] >= 1)
			{
				System.out.println(x + "	" +	count[x] + "\n");
			}
		}
	}

}
