import java.util.Scanner;
public class boolstatement 
{

	public static void main(String[] args) 
	{
		char numorletter;
		boolean set;
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a character >> ");
		numorletter = input.next().charAt(0); //what??
		
		if (numorletter >= 0 && numorletter <= 9)
		{
			set = false;
		}
		else
		{
			set = true;
		}
		
		
		if (set = false)
		{
			System.out.print("letter");
		}
		else if (set = true)
		{
			System.out.print("hey");
		}
	}

}
