package Workers;

/*
 * Shift Supervisor is a salaried employee, earns a yearly bonus when their shift
 * meets production goals. 
 */
public class ShiftSupervisor extends Employee
{
	/*
	 * Fields
	 */
	private double annualSalary = 55000;			//Annual salary of a shift supervisor
	private double annualProductionBonus = 1500;	//Production Bonus if ss meets production goals
	private int m_shift;
	/*
	 * Constructor
	 */
	public ShiftSupervisor(String name, String number, String date)
	{
		super(name, number, date);
		title = "Shift Supervisor";
	}
	/**
	 * Methods
	 * setSalary(sal:double)
	 * getAnnualSalary(void)
	 * setShift(shift:int)
	 * getShift(void)
	 * applyBonus(void)
	 * toString()
	 */
	public void setSalary(double sal)
	{
		annualSalary = sal;
	}
	public double getAnnualSalary()
	{
		return annualSalary;
	}
	
	/*
	 * Sets day or night shift
	 */
	public void setShift(int shift)
	{
		if(shift == 0)
			dayOrNight = "Day";
		else if(shift == 1)
			dayOrNight = "Night";
		else
			dayOrNight = "INVALID";
		m_shift = shift;
	}
	public int getShift()
	{
		return m_shift;
	}
	/*
	 * bonus is unique to shfit supervisor
	 */
	public void setBonus(double bonus)
	{
		annualProductionBonus = bonus;
	}
	public double getBonus()
	{
		return annualProductionBonus;
	}
	
	public String getTitle()
	{
		return title;
	}
	public String toString()
	{
		String str;
		
		str = title + super.toString()
			+ "\nShift: " + getShift()
			+ "\nSalary: " + getAnnualSalary()
			+ "\nAnnual Bonus: " + getBonus();
		
		return str;
	}

}
