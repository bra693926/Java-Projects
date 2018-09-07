package playdemo;

public class playdemoalternate {

	public static void main(String[] args) {
		playdemowork example = new playdemowork ();
		
		example.setIphone("iphone4");
		example.setGalaxy("glaxy3");
		example.setMicrosoft("micr5");
		example.setPrice(100.00);

		System.out.println("You have ordered a " + example.getIphone() + " sandwich on " + example.getGalaxy() + " bread, and the price is " + example.getMicrosoft() + example.getPrice());
	}

}
