//Filename OverLoadDemo.java
//Written by Brandon Truong
//Written on 2/23/2015
public class OverLoadDemo 
{

	public static void main(String[] args) 
	{
	int myInt = 47;
	String myStr = "Buster";
	int intB = 6;
	String strB= "Mr. Coyote";
	
	MyDisplay(myInt);
	MyDisplay(myStr);
	MyDisplay(intB, strB);
	
	}

public static void MyDisplay(int myI)
{
	System.out.println("myInt: " + myI);
}
public static void MyDisplay(String Bus)
{
	System.out.println("myStr: " + Bus);
}
public static void MyDisplay(int tB, String coy)
{
	System.out.println("intB: " + tB + " and " + " strB: " + coy);
}
}