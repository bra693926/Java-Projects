//Filename: CustomerDemo
//Written by: Brandon Truong
//Written on: 4/13/2015
public class CustomerDemo 
{

	public static void main(String[] args) 
	{
		Customer cust = new Customer("Yosemite Sam", "C145", true); //suppose to be a "yes"
		System.out.print("Name: " + cust.getName() + 
						 "\nCustomer Number: " + cust.getNumber() + 
						 "\nActive Customer: ");
		if(cust.isActive() == true)
			System.out.println("YES \n");
		else if(cust.isActive() == false)	//how do we return yes or no without if statements???
			System.out.println("NO \n");
		
		Customer custt = new Customer("Marvin Martian", "C217", false);
		System.out.print("Name: " + custt.getName() + 
				 		 "\nCustomer Number: " + custt.getNumber() + 
				 		 "\nActive Customer: ");
		if(custt.isActive() == true)
			System.out.println("YES \n");
		else if(custt.isActive() == false)
			System.out.println("NO \n");
		
		PlatinumCustomer pcust = new PlatinumCustomer("Wyle Coyote", "P127", true, 1750.00, 0.05);
		System.out.print("Name: " + pcust.getName() + 
		 		 		 "\nCustomer Number: " + pcust.getNumber() + 
		 		 		 "\nActive Customer: ");
		if(pcust.isActive() == true)
			System.out.println("YES ");
		else if(pcust.isActive() == false)
			System.out.println("NO ");
		
		System.out.print("Purchases: $" + pcust.getPurchase() +//how get purchases to show comma and .00 instead of .0
		 		 		 "\nDiscountlevel: " + pcust.getDiscount() + "\n" );
		
		
		PlatinumCustomer pcustt = new PlatinumCustomer("Elmer Fudd", "P232", true, 2100.00, 0.1);
		System.out.print("\nName: " + pcustt.getName() + 
		 		 		 "\nCustomer Number: " + pcustt.getNumber() + 
		 		 		 "\nActive Customer: ");
		if(pcustt.isActive() == true)
			System.out.println("YES ");
		else if(pcustt.isActive() == false)
			System.out.println("NO ");
		
		System.out.print("Purchases: $" + pcustt.getPurchase() + 
		 		 		 "\nDiscountlevel: " + pcustt.getDiscount() + "\n" );
		

	}

}
