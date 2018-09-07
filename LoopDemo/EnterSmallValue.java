import java.util.Scanner;


public class EnterSmallValue 
{

	public static void main(String[] args) 
	{
		int userEntry;
		final int LIMIT = 3;
		Scanner input = new Scanner(System.in);
		System.out.print("please anter integar no higher than " + 
		LIMIT + " >>> ");
		userEntry = input.nextInt();
		while(userEntry > LIMIT)
		{
			System.out.println("Number entered was too high ");
			System.out.println("Enter integar no higher than " + 
					LIMIT + " >>> ");
					userEntry = input.nextInt();
		}
	System.out.println("You entered " + userEntry);
	}

}
