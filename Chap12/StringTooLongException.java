//Filename:StringTooLongException
//Written by: Brandon Truong
//Written on: 04/20/2015
public class StringTooLongException extends Exception
{

	public StringTooLongException() //(String p) //throws Exception
	{
//		System.out.println("");
		super("String has too many characters \nPlease try again: ");
		
//		if(p.length() > 20)
//		{
//			throw(new Exception());
//		}
	}

}
