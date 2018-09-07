//Filename: StudentDemo.java
//Written by: Brandon Truong
//Written on: 5/18/2015
public class StudentDemo 
{

	public static void main(String[] args) 
	{
		
		Student hey = new Student("FC145", 10, true ); //?? boolean
		Student hi = new Student();
		
		hi.setNumber("FC217");
		hi.setUnits(8);
		hi.setSchol(false);
		
		System.out.println("Student number: " + hey.getNumber());
		System.out.println("Number of units: " + hey.getUnits());
		System.out.println("Scholarship Student: " + hey.isSchol());
		
		
		System.out.println("Unit fee: $" + hey.fee + " and Health fee: $" + hey.health + 
												" >> Total fee: $" + hey.Studentfees() + "\n");
		
		System.out.println("Student number: " + hi.getNumber());
		System.out.println("Number of units: " + hi.getUnits());
		System.out.println("Scholarship Student: " + hi.isSchol());
		
		System.out.println("Unit fee: $" + hi.fee + " and Health fee: $" + hi.health + 
												" >> Total fee: $" + hi.Studentfees() );


	}

}
