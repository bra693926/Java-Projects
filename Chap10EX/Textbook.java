//Filename: Textbook
//Written by: Brandon Truong
//Written on: 4/13/2015
public class Textbook extends Book
{
	private String classl;
	
	public Textbook(String t, int p, String classlevel)
	{
		super(t, p);
		classl = classlevel;

	}
	
	public String getClasslevel() {
		return classl;
	}

	public void setClasslevel(String classlevel) {
		this.classl = classlevel;
	}
	
}
