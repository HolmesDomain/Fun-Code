// Figure 9.4 ComissionEmployee.java
//Represents an employee paid a percentage of sales

//Figure 9.10 uses mehods to manipulate instance variables
public class ComissionEmployee extends Object
{
	protected final String firstName;
	protected final String lastName;
	protected final String socialSecurityNumber;
	protected double grossSale;
	protected double commissionRate;
	
	//five argument constructor
	public ComissionEmployee(String firstName,String lastName,String socialSecurityNumber, double grossSales,
			double commissionRate)
	{
		//Implicit call to objects default constructor here
		
		//exception handler
		if(grossSales < 0.0)
			throw new IllegalArgumentException(
					"Gross sales must be >= 0.0");
		if(commissionRate <= 0.0 || commissionRate >= 1.0)
			throw new IllegalArgumentException(
					"Commission rate must be > 0.0 and < 1.0");
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.grossSale = grossSales;
		this.commissionRate = commissionRate;
		
	}//End constructor
	
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
	
	//get gross sales amount
	public void setGrossSales(double grossSale)
	{
		if(grossSale < 0.0)
			throw new IllegalArgumentException(
					"Gross sales must be >= 0.0");
		
		this.grossSale = grossSale;
	}
	
	public double getGrossSales()
	{
		return grossSale;
	}

	public void setComissionRate(double commissionRate)
	{
		if(commissionRate <= 0.0 || commissionRate >=1.0)
			throw new IllegalArgumentException(
					"Commission rate must be > 0.0 and < 1.0");
		
		this.commissionRate = commissionRate;
	}
	
	public double getCommissionRate()
	{
		return commissionRate;
	}
	
	public double earnings()
	{
		return commissionRate * grossSale;
	}
	
	public double earnings2()
	{
		return commissionRate * grossSale;
	}
	
	//return string representation of object
	@Override //Indicates that this method overrides a superclass method
	public String toString()
	{
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
				"commission employee", firstName, lastName,
				"Social security number", socialSecurityNumber,
				"gross sales", grossSale,
				"commission rate", commissionRate);
	}
	
	/*Figure 9.10*/ public String toString2()
	{
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
				"commission employee", getFirstName(), getLastName(),
				"Social security number", getSocialSecurityNumber(),
				"gross sales", getGrossSales(),
				"commission rate", getCommissionRate());
	}
} //end Class
