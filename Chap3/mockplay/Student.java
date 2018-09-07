package mockplay; public class Student 
{
	private String idNumber;
	private int hoursEarned;
	private int pointsEarned;
	
	public double CalcGpa()
	{
		double gpa = pointsEarned * 1.0 / hoursEarned;
		return gpa;
		
	}
	
	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public int getHoursEarned() {
		return hoursEarned;
	}

	public void setHoursEarned(int hoursEarned) {
		this.hoursEarned = hoursEarned;
	}

	public int getPointsEarned() {
		return pointsEarned;
	}

	public void setPointsEarned(int pointsEarned) {
		this.pointsEarned = pointsEarned;
	}
	
}
