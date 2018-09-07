//Filename: CountByFives
//Written by: Brandon Truong
//Written on: 3/09/2015

public class Purchase
{

	static int invoice; //still dont know what static is....
	static double sale;
	static double salestax;
	final static double tax = 0.05; //static??
	
//	public static int getInvoice(int invoice) { 			//forgot what getters and setters do
//		return invoice;
//	}
	public static void setInvoice(int invoice) {
		Purchase.invoice = invoice;
	}
//	public static int getSale() {
//		return sale;
//	}
	public static void setSale(double sale) {
		Purchase.sale = sale;
		salestax = tax * sale;
	}
	
	public static void Display()
	{
		System.out.println("Invoice #" + invoice + " Amount of sale: $" + sale + " Tax: $" + salestax);
		
	}
}
