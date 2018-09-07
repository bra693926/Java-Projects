package Comments; public class mockDeclareTwoEmployees 
{

	public static void main(String[] args) 
	{
		mockEmployee clerk = new mockEmployee();
		mockEmployee driver = new mockEmployee();
		
		clerk.setEmpNum(345);
		driver.setEmpNum(567);
		
		System.out.println("The clerk's number is " + clerk.getEmpNum() + " and salary is $" + driver.getEmpSalary());

	}

}
