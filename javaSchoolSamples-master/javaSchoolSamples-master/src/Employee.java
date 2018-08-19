//Figure 10.4
//Employee abstract superclass
public abstract class Employee 
{
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	private String birthdate;
	public double weeklySalary;
	
	//constructor
	public Employee(String firstName,String lastName, String socialSecurityNumber)
	{
		this.firstName =firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		
	}
	
	public void addWeeklysalary(double add) {

	}

	//return first name
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public String getSocialSecurityNumber()
	{
		return socialSecurityNumber;
	}
	
	//return String representation
	@Override
	public String toString()
	{
		return String.format("%s %s%nsocial security number: %s", getFirstName(),
				getLastName(), getSocialSecurityNumber());
	}
	
	//abstract must be overriden by concrete subclasses
	protected abstract double earnings(); //no implementtion here	
}

//Figure 10.5
class SalariedEmployee extends Employee
{
	//constructor
	
	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary)
	{
		super(firstName, lastName, socialSecurityNumber);
		
		if(weeklySalary < 0.0)
			throw new IllegalArgumentException(
					"Weekly salary must be >= 0.0");
		
		this.weeklySalary = weeklySalary;
	}
	
	public void setWeeklysalary(double weeklySalary)
	{
		if(weeklySalary < 0.0)
			throw new IllegalArgumentException(
					"Weekly salary must be >= 0.0");
		
		this.weeklySalary = weeklySalary;
	}
	
	@Override
	public void addWeeklysalary(double add)
	{
		if(add < 0.0)
			throw new IllegalArgumentException(
					"Weekly salary must be >= 0.0");
		
		this.weeklySalary += add;
	}
	
	//return policy
	public double getWeeklySalary()
	{
		return weeklySalary;
	}
	
	@Override
	public double earnings()
	{
		return getWeeklySalary();
	}
	
	@Override 
	public String toString()
	{
		return String.format("salaried employee: %s%n%s: $%, .2f",
		super.toString(), "Monthly salary", getWeeklySalary());
	}
	
}

class DateClass 
{
	private int month;
	private int day;
	private int year;
	
	public DateClass(int month,int day,int year)
	{
		this.month = month;
		this.day = day;
		this.year = year;
	}	
	
	public void setMonth(int month)
	{
		this.month = month;
	}
	
	public void setDay(int day)
	{
		this.day = day;
	}
	
	public void setYear(int year)
	{
		this.year = year;
	}
	
	public int getMonth()
	{
		return month;
	}
	
	public int getDay()
	{
		return day;
	}
	
	public int getYear() 
	{
		return year;
	}
	
	public void displayDate()
	{
		System.out.print("Date is: " + this.month + "/" + this.day + "/" + this.year);
	}
}
