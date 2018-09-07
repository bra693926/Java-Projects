//Filename: Demobook
//Written by: Brandon Truong
//Written on: 4/13/2015
public class Demobook 
{

	public static void main(String[] args) 
	{
		Book bbook = new Book("Cat in the Hat", 61);
		Textbook tbook = new Textbook("java programming", 1084, "sophomore");
		
//		tbook.setClasslevel("Sophomore");
//		tbook.setPages(1084);
//		tbook.setTitle("Java programming");
		
//		bbook.setTitle("Cat in the Hat");
//		bbook.setPages(61);
		
		System.out.println("Book 1 is " + bbook.getTitle() + " with " + bbook.getPages() + " pages.");
		System.out.print("Book 2 is " + tbook.getTitle() + " with " + 
						tbook.getPages() + " pages. It is for class level " + tbook.getClasslevel());
		
	}

}
