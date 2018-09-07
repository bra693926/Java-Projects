//Filename:Student

//Written by: Brandon Truong

//Written on: 02/20/2015

public class Student 
{
	private String idNumber;
	private double hoursEarned;
	private double pointsEarned;

	//public static void main(String[] args) {}
	
	public double calcgpa()
	{
		double gpa = pointsEarned *1.0/ hoursEarned;
		return gpa;	
	}
	
	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public double getHoursEarned() {
		return hoursEarned;
	}

	public void setHoursEarned(double hoursEarned) {
		this.hoursEarned = hoursEarned;
	}

	public double getPointsEarned() {
		return pointsEarned;
	}

	public void setPointsEarned(double pointsEarned) {
		this.pointsEarned = pointsEarned;
	}
	
}
