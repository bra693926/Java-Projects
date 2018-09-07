//Filename: TestBankAccount.java
//Written by: Brandon Truong
//Written on: April 4, 2015
import java.util.Scanner;

public class TestBankAccount 
{

	public static void main(String[] args) 
	{
		BankAccount hey= new BankAccount();
		BankAccount bye= new BankAccount();
		BankAccount hi= new BankAccount();
		BankAccount later= new BankAccount();
		
		hey = getData();
		bye = getData();
		hi = getData();
		
		showValues(hey);
		showValues(bye);
		showValues(hi);
		showValues(later);

	}
	
	public static BankAccount getData()
	{
		BankAccount object = new BankAccount();
		Scanner key = new Scanner(System.in);
		
		System.out.print("Enter account number >> ");
		String a = key.nextLine();
		System.out.print("Enter name >> ");
		String n = key.nextLine();
		System.out.print("Enter balance >> ");
		double b = key.nextDouble();

		object.setAccount(a);
		object.setName(n);
		object.setBal(b);
		
		return object;
	}
	public static void showValues(BankAccount objecttwo)
	{
		
		System.out.println("Your BankAccount results:");
		System.out.println("Acct # : " + objecttwo.getAccount());
		System.out.println("Name   : " + objecttwo.getName());
		System.out.println("Balance: " + objecttwo.getBal());
		
		objecttwo.explainAccountPolicy();
		
	}

}