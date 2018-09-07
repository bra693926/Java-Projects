//Filename: Employee
//Written by: Brandon Truong
//Written on: 3/23/2015
public class Employee 
{

	private static String id;
	private static String name;
	private static double hours;
	private static double payrate;
		
	static double grosspay;
//-------------------------------------------
	public static String getId() {
		return id;
	}

	public static void setId(String id) { 
		Employee.id = id;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Employee.name = name;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public double getPayrate() {
		return payrate;
	}

	public void setPayrate(double payrate) {
		this.payrate = payrate;
	}
//----------------------------------------------------------------------
	public static double CalcGrossPay()
	{
		grosspay = hours * payrate;
		grosspay = Math.round(grosspay*100.0)/100.0;
		return grosspay;
	}
	
	public static double NetPay()
	{
		double totalpay = (grosspay * .85); //is this right?
		totalpay = Math.round(totalpay*100.0)/100.0;
		return totalpay;
	}

	public static void Display()
	{
		System.out.println( id + "\n" + name + "\nGross pay: $" + Employee.CalcGrossPay() + "\nNet pay: $" + Employee.NetPay() );
		
	}
}
