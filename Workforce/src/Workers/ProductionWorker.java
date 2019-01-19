package Workers;

public class ProductionWorker extends Employee
{
	private int m_shift; 			//0 for night, 1 for day
	private double m_payRate; 		//Hourly pay rate
	
	/*
	 * Constructor accepts an employee name, employee number,
	 * and employee start date and initializes superclass
	 */
	public ProductionWorker(String name, String number, String date) 
	{
		super(name, number, date);
		title = "Production Worker";
	}
	/**
	 * getters and setters
	 */
	
	/* setShift method unique for hourly pay workers
	 * shift = 0; night shift
	 * shift = 1; day shift
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
	
	public void setPayRate(double payRate)
	{
		m_payRate = payRate;
	}
	
	public int getShift()
	{
		return m_shift;
	}
	
	public double getPayRate()
	{
		return m_payRate;
	}
	
	public String getTitle()
	{
		return title;
	}
	public String callToString()
	{
		return super.toString();
	}
	public String toString()
	{
		String str;
		str = title + "\n" + super.toString() +
				"\n" + title + "Shift: " + dayOrNight +
				"\n" + title + "Hourly Pay: " + m_payRate;
		
		return str;
	}
	

}
