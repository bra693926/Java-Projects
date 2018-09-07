//Filename: Student.java
//Written by: Brandon Truong
//Written on: 5/18/2015
public class Student 
{

	private String number;
	int units;
	boolean schol;
	
	int fee = 58;
	int health = 20;
	
	public Student(String n,int u, boolean s) 
	{
		this.number = n;
		this.units = u;
		this.schol = s;

	}
	public Student() 
	{}


	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getUnits() {
		
		fee = 58;
		
		if(schol == true)
		{
			fee = 0;
			
		}
		
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

	public String isSchol() 
	{
		String phrase = null;
		
		if(schol == true)
		{
			phrase = "YES";
		}
		if(schol == false)
		{
			phrase = "NO";
		}
	
		return phrase;
	}

	public void setSchol(boolean schol) {
		this.schol = schol;
	}

	public double Studentfees() 
	{
		double price;
		units = getUnits();
		
		price = units * fee + health;
		return price;
		
	}

}
