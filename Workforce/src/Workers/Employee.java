package Workers;

public abstract class Employee 
{
	private String 	EmployeeName,
					EmployeeNumber,
					EmployeeStartDate;
	public String title;
	protected String dayOrNight;
	
	/**
	 * The Constructor accepts as arguments the
	 * employee's name, number, and start date. 
	 */
	public Employee(String name, String number, String date)
	{
		EmployeeName = name;
		EmployeeNumber = number;
		EmployeeStartDate = date;
	}
	
	/*
	 * getters and setters
	 */
	public String getName()
	{
		return EmployeeName;
	}

	public String getNumber()
	{
		return EmployeeNumber;
	}
	
	public String getStartDate()
	{
		return EmployeeStartDate;
	}
	/*
	 * abstract methods: must be present in all employee
	 * classes
	 */
	public abstract void setShift(int shift);
	public abstract int getShift();
	public abstract String getTitle();
	
	/**
	 * toString method
	 */
	public String toString()
	{
		String str;
		
		str = 	"Employee Name: " + EmployeeName +
				"\nEmployee Number: " + EmployeeNumber +
				"\nEmployee Start Date: " + EmployeeStartDate;
		
		return str;
	}
}
