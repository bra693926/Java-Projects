import java.util.Scanner;
public class TryToCompareStrings 
{ 

	public static void main(String[] args) 
	{
		String aName = "Carmen";
		String anotherName;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name > ");
		anotherName = input.nextLine();
		if(aName.equals(anotherName)) //must put this
			//not put if(aName==anotherName)
			System.out.println(aName + " equals " + anotherName);
		else
			System.out.println(aName + " does not equal " + anotherName);

	}

}
//this class is to show you that two matching memory addresses will not work