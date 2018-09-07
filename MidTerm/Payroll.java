//Filename: Payroll
//Written by: Brandon Truong
//Written on: 3/23/2015
public class Payroll 
{

	public static void main(String[] args) 
	{
		Employee driver1 = new Employee();
		Employee driver2 = new Employee();
		
		driver1.setId("123");
		driver1.setName("Wyle Coyote");
		driver1.setHours(23.5);
		driver1.setPayrate(15.75);
		
		driver1.Display();
		
		System.out.println();
		
		driver2.setId("456");
		driver2.setName("Yosemite Sam");
		driver2.setHours(35.5);
		driver2.setPayrate(17.25);
		
		driver2.Display();
		
	}

}
