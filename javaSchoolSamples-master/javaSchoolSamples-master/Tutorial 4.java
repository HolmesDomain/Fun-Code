import java.util.*;
//t4.java - Tutorial 4
//CSIS 212-D01 LUO
//All work is original.
public class t4 {

	//Figure 5.9 Scope variables (field below)
	private static int x = 1;
	
	public static void main(String[] args) 
	{
		//Figure 5.3
		//input method maximum
		//Header
		System.out.println("Andrew Holmes - Tutorial 4");
		System.out.println("");
	
		Scanner scan = new Scanner(System.in);
		//input
		System.out.print("enter 3 floats seperated by spaces");
		double one = scan.nextDouble();
		double two = scan.nextDouble();
		double three = scan.nextDouble();
		//calculate
		double result = maximum(one,two,three);
		
		System.out.println("Maximum is: "+ result);
		
		//Figure 5.9
		int x = 5;
		
		System.out.println("");
		System.out.printf("local x in main is %d%n", x);
		
		useLocalVariable(); // has local x
		useField(); // uses class field x
		useLocalVariable();
		useField();
		
		System.out.printf("%nlocal x in main is %d%n", x);
		
		//Figure 5.10
		System.out.printf("Square of integer 7 is %d%n", square(7));
		System.out.printf("Square of integer 7 is %f%n", square(7.5));
		scan.close();
	}
	public static double maximum(double a, double b, double c)
	{
		double maxval = a; //assume a is largest
		
		if(b > maxval)
			maxval = b;
		
		if(c > maxval)
			maxval = c;
		
		return maxval;
	}
	public static void useLocalVariable()
	{
		int x = 25;
		
		System.out.printf("%nlocal x on entering method useLocalVariable is %d%n", x);
		++x; //modifies the methods local variable
		System.out.printf("local x before exiting method useLocalVariable is %d%n", x);		
	}
	public static void useField()
	{
		System.out.printf("%nfield x on entering method useField is %d%n", x);
		x *= 10; // modifies class t4's field x variable
		System.out.printf("field x on before exiting method useField is %d%n", x);
	}	
	//Figure 5.10 methods
	public static int square(int num)
	{
		System.out.printf("%nCalled square with int argument: %d%n", num);
		return num*num;	
	}
	public static double square(double doublz)
	{
		System.out.printf("%nCalled square with double argument: %f%n", doublz);
		return doublz*doublz;	
	}
}
