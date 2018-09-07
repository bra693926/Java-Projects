//Filename: Invoicing
//Written by: Brandon Truong
//Written on: 2/25/2015

public class TestInvoice 
{

	public static void main(String[] args) 
	{
	Invoicing driver = new Invoicing();
	
	
	// driver.computeInvoice("Total" + 
	// do not write pricebook inside
	//System.out.println("")
	
	driver.computeInvoice(24.95); 
	System.out.println("Total: $" + driver.computeInvoice(24.95) );
	
	driver.computeInvoice(17.50, 4); // do not write pricebook and coupon
	System.out.println("Total: $" + driver.computeInvoice(17.50, 4) );
	
	driver.computeInvoice(10.00, 6, 20.00); //do not write all 3 things
	System.out.println("Total: $" + driver.computeInvoice(10.00, 6, 20.00));
	// do not need this: driver.computeInvoice();
	
	// do not need this System.out.println();
	}

}
/*
main() method that tests all three overloaded methods using the these:
 $24.95
 $17.50, 4
 $10.00, 6, $20.00
	Output:
	Total: $26.95
	Total: $75.60
	Total: $43.20 */