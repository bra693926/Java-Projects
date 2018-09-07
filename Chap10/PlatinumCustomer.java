//Filename: PlatinumCustomer
//Written by: Brandon Truong
//Written on: 4/13/2015
public class PlatinumCustomer extends Customer
{
	double discount;
	double purchase;
	
	public PlatinumCustomer(String n, String num, boolean a, double p, double d)
	{
		super(n, num, a);
		
		purchase = p;
		discount = d;
		
	}

	public double getDiscount() 
	{
		
		if(purchase >= 2000)
		{
			discount = 0.10;
		}
		else if(purchase >= 500 && purchase < 2000)
		{
			discount = 0.05;
		}
		
		return discount;
	}

	public void setDiscount(double discount) 
	{
		this.discount = discount;
	}

	public double getPurchase() 
	{
		return purchase;
	}

	public void setPurchase(double purchase) 
	{
		this.purchase = purchase;
	}
}
