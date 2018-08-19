import java.util.Scanner;
//A6.java -- Classes
//CSIS 212-D01 LUO
//All work is original.
public class A6 {

	public static void main(String[] args) {
		
		//Header
				System.out.println("Andrew Holmes - Assignment 6");
				System.out.println("");
		//Exercise 7.12 Employee Class
		Employee chris = new Employee("Chris","Barnes",1200);
		Scanner scan = new Scanner(System.in);
		Employee sarah = new Employee("Sarah","Mcklin",1239);
		double yearly1 = (chris.getSalary() * 0.10) + chris.getSalary();
		double yearly2 = (sarah.getSalary() * 0.10) + sarah.getSalary();
		
		//No need to set variables, see next Exercise
		
		//Low salary LOL
		System.out.println("EmployeeTest.java: ");
		System.out.println("Salary for " + chris.getFirstn() + " is: " + chris.getSalary());
		System.out.println("Salary for " + sarah.getFirstn() + " is: " + sarah.getSalary());
		System.out.println(chris.getFirstn() + " salary after 10% raise: " + yearly1);
		System.out.println(sarah.getFirstn() + " salary after 10% raise: " + yearly2);
		
		//Exercise 7.13 Date Class
		DateClass date = new DateClass(0,0,0);
		
		
		//Set em'
		System.out.println();
		System.out.print("Enter day: ");
		date.setDay(scan.nextInt());
		System.out.print("Enter month: ");
		date.setMonth(scan.nextInt());
		System.out.print("Enter Year: ");
		date.setYear(scan.nextInt());
		System.out.println();
		
		date.displayDate();
		
		scan.close();
	}

}
