//Filename: TestDigitalCamera

//Written by: Brandon Truong

//Written on: March 9, 2015
import java.util.Scanner;

public class TestDigitalCamera 
{
	
	public static void main(String[] args) 
	{
		
		String camera;
		int number;
		double salesprice;
		int resolution;
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter camera brand ");
		camera = input.next();
		
		System.out.print("Enter megapixels ");
		number = input.nextInt();
		
		DigitalCamera DigitalCamera = new DigitalCamera (camera, number);
		DigitalCamera.setBrand(camera);
		
		System.out.print("Camera brand: " + DigitalCamera.getBrand() + " resolution: " +  DigitalCamera.getResolution() + " megapixels  Sale price $" + DigitalCamera.getSalesprice() );
		

	}

}
