import java.util.Scanner;
//testRectangle.java 
//CSIS 212-D01 LUO
//All work is original.
public class testRectangle {

	public static void main(String[] args) {
	//Header
	System.out.println("Andrew Holmes - Assignment 7");
	System.out.println("");
	
	Rectangle four = new Rectangle();
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Welcome to Rectangle Simulator!");
	
	//Data entry
	System.out.println("Enter width (under 20.00):");
	four.setWidth(scan.nextFloat());
	
	System.out.println("Enter length (under 20.00):");
	four.setLength(scan.nextFloat());
	
	//Calculations
	System.out.println("Perimeter of your rectangle: " + four.perimeter(four.getWidth(), four.getLength())
	+ " and area: " + four.area(four.getWidth(), four.getLength()));


	}

}
