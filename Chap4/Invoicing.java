//Filename: Invoicing
//Written by: Brandon Truong
//Written on: 2/25/2015

public class Invoicing 
{

	private static final double salesTax = 0.08; //need to put a sales tax value not main title
	//no brackets
	private double pricebook;
	private double quantitybook;
	private double couponbook;
	private static double total;
	
	//no brackets

public static double computeInvoice(double price)
{
	
	total = (price * salesTax) + price;
	
	return total;
}
public static double computeInvoice(double price, double quantity)
{
	
	total = (price * quantity); 
	total = (salesTax * total) + total;

	return total;
}
public static double computeInvoice(double price, double quantity, double coupon) 
{
	
	total = ((price * quantity) - coupon); 
	total = (salesTax * total) + total;

	return total;
}
}