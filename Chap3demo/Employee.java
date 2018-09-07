public class Employee 
{

	private int empNum;
	private String empLastName;
	private String empFirstName;
	private double empSalary;
		
	public Employee()
	{
		empSalary = 300.00;
	}
	
	public double calcGrossPay(double hrsWkd, double payRate)
	{
		double grPay = hrsWkd * payRate;
		return grPay;
	}

	public int getEmpNum() 
	{
		return empNum;
	}
	
	public void setEmpNum(int empNum) 
	{
		this.empNum = empNum;
	}
	
	public String getEmpLastName() 
	{
		return empLastName;
	}
	
	public void setEmpLastName(String empLastName) 
	{
		this.empLastName = empLastName;
	}
	
	public String getEmpFirstName() 
	{
		return empFirstName;
	}
	
	public void setEmpFirstName(String empFirstName) 
	{
		this.empFirstName = empFirstName;
	}
	
	public double getEmpSalary() 
	{
		return empSalary;
	}
	
	public void setEmpSalary(double empSalary) 
	{
		this.empSalary = empSalary;
	}

}