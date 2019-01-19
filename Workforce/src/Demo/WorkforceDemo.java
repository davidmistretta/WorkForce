package Demo;
import java.util.Scanner;

import Workers.*;

public class WorkforceDemo 
{
	
	public static void main(String[] args) 
	{
		String answer; 
		char yn;
		boolean on;		
		
		String name, number, date;	//Employee Name, Employee Number, Employee Date
		int type;					//Employee Type (production, shift supervisor, team leader)
		
		/*
		 * Add a worker - get preliminary on value
		 */
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Would you like to add a worker? (y/n)");
		answer = keyboard.nextLine().toUpperCase();
		yn = answer.charAt(0);
		
		if(yn == 'Y')
			on = true;
		else
			on = false;
		
		while(on)
		{
			System.out.println("Employee Name: ");
			name = keyboard.nextLine();
			System.out.println("Employee Number: ");
			number = keyboard.nextLine();
			while(!numberValidation(number))
			{
				System.out.println("Invalid Employee Number"
							+"\nPlease enter Employee Number with format XXXL"
							+"X being a number, L being a letter.");
				System.out.println("Employee Number: ");
				number = keyboard.nextLine();
			}
			System.out.println("Employee Start Date(mm-dd-yyyy): ");
			date = keyboard.nextLine();
			while(!dateValidation(date))
			{
				System.out.println("Invalid Employee Start Date"
							+"\nPlease enter Employee Start Date with format mm-dd-yyyy"
							+"m being month, d being day, y being year.");
				System.out.println("Employee Start Date(mm-dd-yyyy): ");
				date = keyboard.nextLine();
			}
			System.out.println("Employee Title"
					+ "\n1.) Production Worker"
					+ "\n2.) Shift Supervisor"
					+ "\n3.) Team Leader");
			type = keyboard.nextInt();
			keyboard.nextLine(); //eat newline
			
			switch(type)
			{
				case 1:
					System.out.println("Initializing a Production Worker");
					ProductionWorker prodWorker = new ProductionWorker(name, number, date);
					System.out.println("Shift(0 - day, 1 - night): ");
					prodWorker.setShift(keyboard.nextInt());
					System.out.println("Hourly Pay: ");
					prodWorker.setPayRate(keyboard.nextDouble());
					System.out.println(prodWorker);
					break;	
				case 2:
					System.out.println("Initializing a Shift Supervisor");
					ShiftSupervisor ssWorker = new ShiftSupervisor(name, number, date);
					System.out.println(ssWorker);
					break;
				case 3:
					System.out.println("Initializing a Team Lead");
					TeamLead teamLead = new TeamLead(name, number, date);
					System.out.println("Shift(0 - day, 1 - night): ");
					teamLead.setShift(keyboard.nextInt());
					System.out.println("Hourly Pay: ");
					teamLead.setPayRate(keyboard.nextDouble());
					System.out.println(teamLead);
					break;
					
				default:
						break;
			}
			
			keyboard.nextLine();
			System.out.println("Would you like to add another worker? (y/n)");
			answer = keyboard.nextLine().toUpperCase();
			yn = answer.charAt(0);
			if(yn == 'Y')
				on = true;
			else
				on = false;
		}
		
	}
	
	/**
	 * Methods to evaluate input parameters to ensure they are 
	 * valid entries.
	 *  numberValidation - Ensures EmployeeNumber is of form ###L
	 * 	dateValidation - Ensures date input ##-##-#### or ##/##/####
	 */
	/*
	 * Employee Number ###L
	 */
	private static boolean numberValidation(String number2)
	{
		String str = number2;
		char[] numArray;
		numArray = str.toCharArray();
		int length = numArray.length;
		/*
		 * for loop to check if first three chars are digits
		 */
		for(int i = 0; i < length-1; i++)
		{
			if(!Character.isDigit(numArray[i]))
				return false;
		}
		/*
		 * Check if last char is a letter
		 */
		if(!Character.isLetter(numArray[length-1]))
			return false;
		
		//returns true if correct
		return true;
	}
	/*
	 * Start Date ##/##/####
	 */
	private static boolean dateValidation(String date)
	{
		String str = date;
		char[] dateArray = str.toCharArray();
		for(int i = 0; i < str.length(); i++)
		{
			/*
			 * Check for ##/##/#### or ##-##-####
			 */
			/*
			 * at 2 and 5, either '/' or '-'
			 */
			if(i == 2|| i == 5)
			{
				//System.out.println("2 or 5");
				if(str.charAt(i) != '/' && str.charAt(i) != '-')
				{
					//System.out.println("str.charAt(i): " + str.charAt(i));
					System.out.println("False at ping");
					return false;
				}
			}
			/*
			 * check if every other char is a digit
			 */
			else {
				if(!Character.isDigit(dateArray[i])) {
					System.out.println("false at pong");
					return false;
				}
			}
		}
		return true;
	}
}
