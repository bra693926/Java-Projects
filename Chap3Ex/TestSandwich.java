//Filename:TestSandwich.java

//Written by: Brandon Truong

//Written on: 02/09/2015

public class TestSandwich {

	public static void main(String[] args) {
		Sandwich example = new Sandwich ();
		
		example.setIngredient("tuna");
		example.setBread("wheat");
		example.setPrice(4.99);
		
	System.out.println("You have ordered a " + example.getIngredient() + " sandwich on " + example.getBread() + " bread, and the price is " + example.getPrice());
		
	}

}
