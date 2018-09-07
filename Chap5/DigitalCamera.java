//Filename: DigitalCamera

//Written by: Brandon Truong

//Written on: March 9, 2015

public class DigitalCamera 
{

	private String brand;
	private int resolution;
	private double salesprice;
	final int bigmegapixel = 10; 
	final int smallmegapixel = 6;
	final double bigprice = 129.00;
	final double smallprice = 99.00;
	
	public DigitalCamera(String brand, int megapixel)
	{
		
		if(megapixel >= bigmegapixel)
		{
			resolution = 10;
			salesprice = bigprice;
		}
		else if(megapixel >= smallmegapixel)
		{
			resolution = 6;
			salesprice = smallprice;
		}
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getResolution() {
		return resolution;
	}

	public void setResolution(int resolution) {
		this.resolution = resolution;
	}

	public double getSalesprice() {
		return salesprice;
	}

	public void setSalesprice(double salesprice) {
		this.salesprice = salesprice;
	}
	
}
