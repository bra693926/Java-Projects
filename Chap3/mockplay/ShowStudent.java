package mockplay; 
import java.util.Scanner;
public class ShowStudent 
{

	public static void main(String[] args) 
	{	
		String id;
		int points;
		int hours;
		
		Student instance = new Student();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("id #:");
		id = input.nextLine();
		instance.setIdNumber(id);
		System.out.print("points #:");
		points = input.nextInt();
		instance.setPointsEarned(points);
		System.out.print("hours #:");
		hours = input.nextInt();
		instance.setHoursEarned(hours);
		
		System.out.println(" ID number: " + instance.getIdNumber() + "\n Points earned :" + instance.getPointsEarned() 
				+ "\n Credit hours: " + instance.getHoursEarned() + "\n Grade Point Average: " + instance.CalcGpa() );

	}

}
