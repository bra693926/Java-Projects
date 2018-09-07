public class employee {

	public static void main(String[] args) {
		demoemployee clerk = new demoemployee();
		demoemployee driver = new demoemployee();
		
		clerk.setEmpNum(345);
		driver.setEmpNum(567);
		
		System.out.println("The clerk's number is" + clerk.getEmpNum() + "and salary is " + clerk.getEmpSalary());

	}

}
