//Filename: BankAccount.java
//Written by: Brandon Truong
//Written on: April 4, 2015
public class BankAccount 
{

	private String account = "99999";
	private String name = "XXXXX";
	private double bal = 0.0;
	
//	public BankAccount(String a, String n, double b) //dont use constructor or static void in constructor
//	{
		
//		account = a;
//		name = n;
//		bal = b;
	
//	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}
	
	
	public double deductMonthlyFee()
	{
		
		bal = getBal();
		bal = bal - 4.00;
		return bal;
	}
	public void explainAccountPolicy()
	{
		
		System.out.println("\nAfter deduction new balance is $" + deductMonthlyFee());
		System.out.println("A service fee of $4.0 is deducted from each account once a month\n");
		
	}

}
