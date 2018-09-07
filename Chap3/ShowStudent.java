//Filename:Student

//Written by: Brandon Truong

//Written on: 02/20/2015
public class ShowStudent 
{

	public static void main(String[] args) 
	{
	Student john= new Student(); 	
	
	john.getHoursEarned();
	john.getIdNumber();
	john.getPointsEarned();
	john.setHoursEarned(15);
	john.setIdNumber("1234S");
	john.setPointsEarned(47);
	
	
	john.calcgpa();
	
	System.out.println("ID number: " + john.getIdNumber() + "\n" + "Points earned : " + john.getPointsEarned() + "\n" + "Credit hours: " + john.getHoursEarned() + '\n' + "Grade Point Average: " + john.calcgpa() );
	}

}
