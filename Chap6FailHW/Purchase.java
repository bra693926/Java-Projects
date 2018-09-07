//Filename: CountByFives
//Written by: Brandon Truong
//Written on: 3/09/2015

public class Purchase
{

	static int invoice;
	static int sale;
	final static int tax = 0.05;
	
	public static int getInvoice() {
		return invoice;
	}
	public static void setInvoice(int invoice) {
		Purchase.invoice = invoice;
	}
	public static int getSale() {
		return sale;
	}
	public static void setSale(int sale) {
		Purchase.sale = sale;
		tax = .05 * sale;
	}
	
	public static void display()
	{
//  include a display method that displays a purchase’s details
		
	}
	
}
