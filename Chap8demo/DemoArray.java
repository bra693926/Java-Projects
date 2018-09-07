
public class DemoArray {

	public static void main(String[] args) 
	{
		double [] salaries = new double [4];
		
		salaries[0] = 6.25;
		salaries[1] = 6.55;
		salaries[2] = 10.25;
		salaries[3] = 16.85;
		
		System.out.println("Salaries one by one are: ");
		//System.out.println(salaries[0]);
		//System.out.println(salaries[1]);
		//System.out.println(salaries[2]);
		//System.out.println(salaries[3]);
		
		for(int x=0; x<4; ++x)
			System.out.println(salaries[x]);
		
//slide 13, 14, 15, 
	}

}
