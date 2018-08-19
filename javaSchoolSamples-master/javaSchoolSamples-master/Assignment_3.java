package assignment3;
import java.util.Scanner;

//a3.java -- Sales Commission Calculator
//CSIS 212-D01 LUO
//All work is original. 

public class a3 {
	
	public static void main(String[] args) {
		//Header
		System.out.println("Andrew Holmes - Assignment 2");
		System.out.println("");
		
		//Exercise 4.16 Bar Chart Printing
		Scanner scan = new Scanner(System.in);
		int a = 0; int b = 0; int c = 0; int d = 0; int e = 0; int count = 0; 
		
		System.out.println("Enter 5 numbers between 1 and 30:");
		//user inputs five numbers				
		System.out.print("Enter:");
		a = scan.nextInt();
		while(a < 1 || a > 30)
		{
			System.out.print("Please enter valid number:");
			a = scan.nextInt();
		}
		System.out.print("Enter:");
		
		b = scan.nextInt();
		while(b < 1 || b > 30)
		{
			System.out.print("Please enter valid number:");
			b = scan.nextInt();
		}
		System.out.print("Enter:");
		
		c = scan.nextInt();
		System.out.print("Enter:");
		while(c < 1 || c > 30)
		{
			System.out.print("Please enter valid number:");
			c = scan.nextInt();
		}
		
		d = scan.nextInt();
		System.out.print("Enter:");
		while(d < 1 || d > 30)
		{
			System.out.print("Please enter valid number:");
			d = scan.nextInt();
		}
		
		e = scan.nextInt();
		while(e < 1 || e > 30)
		{
			System.out.print("Please enter valid number:");
			e = scan.nextInt();
		}
		
		System.out.println("");
		System.out.println("Bar Graph results below_");
		
		
		while(count < a)
			{
				System.out.print("*");
				count++;
			}
			count = 0;
			System.out.println("");
			while(count < b)
			{
				System.out.print("*");
				count++;
			}
			count = 0;
			System.out.println("");
			while(count < c)
			{
				System.out.print("*");
				count++;
			}
			count = 0;
			System.out.println("");
			while(count < d)
			{
				System.out.print("*");
				count++;
			}
			count = 0;
			System.out.println("");
			while(count < e)
			{
				System.out.print("*");
				count++;
			}
			count = 0;
			System.out.println("");
			exercise();
			scan.close();
	}
	public static void exercise(){
		//Exercise 4.12 product calculator 
		System.out.println("");
		int index = -1;
		int sum = 0;
		for(int x=0;x<8;x++)
		{
			index += 2;
			sum += index;
			System.out.println(sum);
		}
	}
	
}

