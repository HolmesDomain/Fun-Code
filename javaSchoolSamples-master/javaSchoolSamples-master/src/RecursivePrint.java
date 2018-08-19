import java.util.Random;
//RecursivePrint.java
//Print out recursively 

public class RecursivePrint {
	public static void main(String[] args) {
		System.out.println("Andrew Holmes – Assignment 6-2\n");
		
		int[] array = new int[100];
		Random rand = new Random();
		
		for(int x=0;x<array.length;x++)
		{
			array[x] = rand.nextInt(100)+1;
		}
		
		int count = 0;
		printArray(array,count);			
	}
	
	public static int printArray(int[] a,int x)
	{
			if(x<a.length)
			{
			System.out.printf("%d%n", a[x]);
			return printArray(a,x+1);
			}
			else
				return 0;
	}
}
