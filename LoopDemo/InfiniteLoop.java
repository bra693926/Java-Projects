
public class InfiniteLoop 
{
	static int x;
	
	public static void main(String[] args) 
	{
		
		while(x<2) //be careful of semicolon
		{
		System.out.println("Hello");
		x=x+1;
		}
	
	}

}
