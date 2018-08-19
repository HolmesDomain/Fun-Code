import java.security.SecureRandom; 
import java.util.*;
//A4.java -- Sales Commission Calculator
//CSIS 212-D01 LUO
//All work is original.
public class A4{

	public static void main(String[] args) 
	{
		//Header
		System.out.println("Andrew Holmes - Assignment 4");
		System.out.println("");
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter two intergers to determine if a multiple <enter -1 to Exit>: ");
		
		//Exercise 5.16 isMultiple()
		
		int vibe = 0;
		while(vibe != -1)
		{
			int x = scan.nextInt();
				if(x == -1)
				{
					vibe = -1;
					continue;
				}
			int y = scan.nextInt();
				if(y == -1)
					vibe = -1;
			isMultiple(x,y);		
		}
		
		//Exersice 5.20
		System.out.print("Enter a radius of a circle, and we will calculate if for you. For free!: ");
		double radius = scan.nextInt();
		System.out.println(circleArea(radius));
		
		//Exercise 5.35
		x();
		scan.close();
	}
	
	public static double circleArea (double x)
	{
		double finito = Math.PI * (x*x);
		return Math.floor(finito * 100)/100;
	}
	public static void isMultiple(int a,int b)
	{
		int multiple = b%a;
		boolean check;
		
		if(multiple == 0){
			check = true;
			System.out.println(check);
		}
		else{
			check = false;
			System.out.println(check);
		}
	}
	public static void x()
	{
		Scanner scan = new Scanner(System.in);
		SecureRandom random = new SecureRandom();
		int answer = 0;
		
		while(answer != -1)
		{
		int product;
		int a = 1 + random.nextInt(8);
		int b = 1 + random.nextInt(8);
		product = a *b;
		
		System.out.print("How much is " + a + " times " + b + "? (enter -1 to exit): ");
		answer = scan.nextInt();
		
		   if(answer == -1)
			continue;
		   else if(answer == product)
			{
			   System.out.println("Very Good!!");
			}
		   else
			{		
			   while(answer != product && answer != -1)
				{
				System.out.print("No. Please try again :) ?");
				answer = scan.nextInt();
				}
			   if(answer == -1)
			   {   
				   System.out.println("Bye!");	
				   continue;
			   }
			   System.out.println("Very Good!!");
			}	
		}
	}
}
