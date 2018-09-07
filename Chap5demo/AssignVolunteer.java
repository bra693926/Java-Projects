import java.util.Scanner;
public class AssignVolunteer 
{
// if else statement
	public static void main(String[] args) 
	{
	
		int donationType;
		String volunteer;
		final int ClothingCode=1;
		final int OtherCode=2;
		final String ClothingPricer = "Regina";
		final String OtherPricer = "Marco";
		
		Scanner input = new Scanner(System.in);
		System.out.println("What type of clothing donation is this? ");
		System.out.print("Enter " + ClothingCode + " for clothing, " + OtherCode + " for anything else. ");
		donationType = input.nextInt();
			
			if(donationType == ClothingCode)
				volunteer = ClothingPricer;
			else
				volunteer = OtherPricer;
		
		System.out.println("You entered " + donationType);
		System.out.println("The volunteer who will price this item is " + volunteer);
	}

}
