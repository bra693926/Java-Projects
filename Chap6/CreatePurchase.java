//Filename: CountByFives
//Written by: Brandon Truong
//Written on: 3/09/2015

import javax.swing.JOptionPane;
public class CreatePurchase 
{

	public static void main(String[] args) 
	{
		
		String invoicestate;
		double sale;
		int invoice;
		String saletotal;
		
		
		Purchase helloInvoice = new Purchase(); //relate the two classes together
		
		invoicestate = JOptionPane.showInputDialog("Enter invoice number "); //number for invoice
		invoice = Integer.parseInt(invoicestate); //string info from invoice question passes into int value
		if ((invoice < 1000) || (invoice > 8000)) //int value is compared
		{
			invoicestate = JOptionPane.showInputDialog("Invoice number must be between 1000 and 8000. \nEnter invoice number"); 
			//if value is invalid, this dialog box shows, retype value again
			invoice = Integer.parseInt(invoicestate); //answer from the question will be sent into invoice
		}
		
		helloInvoice.setInvoice(invoice); //send invoice value into setInvoice()
		
		saletotal = JOptionPane.showInputDialog("Enter sale amount "); //get sale amount
		
		sale = Double.parseDouble(saletotal); //convert sale amount String into double
		
		helloInvoice.setSale(sale); //send the new double to setSale()
		
		helloInvoice.Display(); //display the statement which contains the values
		
//		System.out.print("invoice number? ");
//		invoice = input.nextdouble();
//			if ((invoice >= 1000) && (invoice <= 8000))
//			{
//				
//			}
	}

}
