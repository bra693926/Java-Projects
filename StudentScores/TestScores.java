//Filename: TestScores
//Written by: Brandon Truong
//Written on: 5//11/2015
public class TestScores {

	public static void main(String[] args) 
	{
		Student hey = new Student("FC123", 100, 80, 94);
		
//		hey.DisplyInfo();
		
		Student hi = new Student("FC456");
		
		hi.setTestScore(78, 1);
		hi.setTestScore(92, 2);
		hi.setTestScore(80, 3);
		
		hey.DisplyInfo();
		System.out.println();
		hi.DisplyInfo();
		
	}

}
