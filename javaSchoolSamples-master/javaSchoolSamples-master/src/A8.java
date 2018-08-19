//A8.java 
//CSIS 212-D01 LUO
//All work is original.

public class A8 {

	public static void main(String[] args) {
		//Header
		System.out.println("Andrew Holmes - Assignmnet 8");
		System.out.println("");
	
	SalariedEmployee emp1 = new 
			SalariedEmployee("Mark","Tanner","111-21-2212",4000.00);
	SalariedEmployee emp2 = new 
			SalariedEmployee("Dick","Sanders","122-21-2312",3600.00);
	SalariedEmployee emp3 = new 
			SalariedEmployee("Sarah","Jacobs","222-20-9088",3810.00);
	
	DateClass[] bday = new DateClass[3];
	
	DateClass mem1 = new DateClass(3,7,1996);
	DateClass mem2 = new DateClass(5,8,2001);
	DateClass mem3 = new DateClass(1,9,2009);
	
	bday[0] = mem1;
	bday[1] = mem2;
	bday[2] = mem3;
	
    //3 element array
	Employee[] employees = new Employee[3];
	
	employees[0] = emp1;
	employees[1] = emp2;
	employees[2] = emp3;
	
	double salary1 = emp1.getWeeklySalary();
	double salary2 = emp2.getWeeklySalary();
	double salary3 = emp3.getWeeklySalary();
	
	//3 employees
	for(int x=0;x<3;x++)
		{
		System.out.println("Hello " + employees[x]);
				
		for(int m=0;m<12;m++)
				{
					//Error check 
					if(x == 0)
					employees[x].addWeeklysalary(salary1);
					if(x == 1)
						employees[x].addWeeklysalary(salary2);
					if(x == 2)
						employees[x].addWeeklysalary(salary3);
							
					if(m == bday[x].getMonth())
					{
						employees[x].addWeeklysalary(100);
						System.out.println("Happy birthday "+ employees[x].getFirstName());
					}
					
					System.out.println(employees[x].earnings());
				}
				
		}	
	
	}
}