package Demo;

import Workers.ProductionWorker;

public class TeamLead extends ProductionWorker
{
	/*
	 * Fields
	 */
	private double fixedMonthlyBonus = 500;
	private int requiredNumHours = 120;
	
	/*
	 * Constructor
	 */
	public TeamLead(String name, String number, String date)
	{
		super(name, number, date); //references productionWorker
		title = "Team Leader";
	}
	
	/*
	 * Methods
	 * getTitle();
	 * getFixedBonus();
	 * toString();
	 */
	public String getTLShift()
	{
		return dayOrNight;
	}
	public String getTitle()
	{
		return title;
	}
	public double getFixedBonus()
	{
		return fixedMonthlyBonus;
	}
	
	public String toString()
	{
		String str;		
		str = "\n" + title + " - " + super.callToString() 
				+ "\n" + title + " Shift: " + getTLShift()
				+ "\n" + title + " Hourly Pay: " + getPayRate()
				+ "\n" + title + " Monthly Bonus: " + getFixedBonus();
		
		return str;
	}
	
}
