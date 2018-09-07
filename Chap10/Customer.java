//Filename: Customer
//Written by: Brandon Truong
//Written on: 4/13/2015
public class Customer 
{
	private String name;
	private String number;
	private boolean active;
//----------------------------------
	public Customer(String n, String num, boolean a)
	{
		name = n;
		number = num;
		active = a;
		
	}
//----------------------------------	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//-------
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
//-------
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	
}
