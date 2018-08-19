import java.util.Random;
//StackTest.java
//Testing the custom stack "Stack"
public class StackTest {
	public static void main(String[] args)
	{
		System.out.println("Andrew Holmes - Assignment 8");
		System.out.println();
		
		//Stack instantiation
		Stack<String> groupString = new Stack<String>();
		Stack<Integer> groupInteger = new Stack<Integer>();
		
		//Arrays for Stacks
		String[] words = new String[]{"cat","bat","sat","mat","butts"};
		Integer[] numb = new Integer[7];
		
		//Random ints for fun
		Random rand = new Random();	
		for(int x=0;x<numb.length;x++)
			numb[x] =rand.nextInt(50);
		
		//Fun with custom Stack! 
		System.out.println("INTEGER STACK-----");
		
		groupInteger.push(numb);
		System.out.println();
		
		System.out.println("Stack size is: " + groupInteger.size());
		System.out.println();
		
		//show isEmpty False
		groupInteger.isEmpty();		
		System.out.println();
		
		groupInteger.pop();	
		System.out.println();
		
		System.out.println("Stack size is: " + groupInteger.size());
		System.out.println();
		
		groupInteger.isEmpty();
		System.out.println();
		
		//		
		System.out.println("STRING STACK-----");

		groupString.push(words);	
		System.out.println();
		
		System.out.println("Stack size is: " + groupString.size());
		System.out.println();
		
		groupString.isEmpty();
		System.out.println();
		
		groupString.pop();
		System.out.println();
		
		System.out.println("Stack size is: " + groupString.size());
		System.out.println();
		
		groupString.isEmpty();
		System.out.println();

	}
	
}
