//Filename: Student
//Written by: Brandon Truong
//Written on: 5//11/2015

public class Student 
{

	//private static String id;
	//private static int scoreo;
	//private static int scoret;
	//private static int scoreth;
	
	private String id;
	private int scoreo;
	private int scoret;
	private int scoreth;
	
	public Student(String i, int o, int t, int th) //dont need static void
	{
		id = i;
		scoreo = o;
		scoret = t;
		scoreth = th;

	}
	public Student(String i)  //dont need static void
	{
		id = i;
	}
//--------------	
	public void setTestScore(int score, int numtest)
	{ //parameters for what test is it and what is the designated score
		if(numtest == 1)
		{
			this.scoreo = score;
		}
		if(numtest == 2)
		{
			this.scoret = score;
		}
		if(numtest == 3)
		{
			this.scoreth = score;
		}
		
	}
	public int getTestScore(int numtest) //int test)
	{
		if(numtest == 1)
		{
			return scoreo;
		}
		if(numtest == 2)
		{
			return scoret;
		}
		if(numtest == 3)
		{
			return scoreth;
		}
		else
		{
			return 0;
		}
		
	}
//-------------
	public double average(int o, int t, int th) //int one, int two, int three)
	{
		double total; 
		
		total = o + t + th;
		double average = total / 3; 
		
		average = Math.round(average*100.00)/100.00;
						//round off 2 places
		return average;
	}
	public void DisplyInfo()
	{
		int varo, vart, varth;
		
		varo = getTestScore(1);
		vart = getTestScore(2);
		varth = getTestScore(3);
		
		System.out.println("Student ID: " + id);
		System.out.println("Test 1 score: " + varo );
		System.out.println("Test 2 score: " + vart );
		System.out.println("Test 3 score: " + varth );
		System.out.println("Average test score: " + average(varo, vart, varth) );
	}

}