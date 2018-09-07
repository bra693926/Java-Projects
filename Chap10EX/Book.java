//Filename: Book
//Written by: Brandon Truong
//Written on: 4/13/2015
public class Book 
{

	private String title; //static??
	private int pages;
//-----------------------------------------------------------	
	public Book(String t, int p)
	{
		title = t;
		pages = p;	//static is for initializing t and p to the variables
		
	}
//--------------------------------------------
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
	
	
}
