import java.util.*;
//linkedListTest.java
//Very first linked list! 
public class linkedListTest {

	public static void main(String[] args) {
	System.out.println("Andrew Holmes – Assignment 5\n");
	int[] digit = new int[25]; 
	//Random Obj
	Random rand = new Random();
	//linkedlist Obj
	List<Integer> list1 = new LinkedList<>();
	//Fill the array
	for(int x=0;x< digit.length;x++)
		digit[x] = rand.nextInt(100)+1;
	//Fill the linkedlist references 
	for(int count : digit)
		list1.add(count);
	//My super-function
	DoItAll(list1);	
	}
	private static void DoItAll(List<Integer> list)
	{	
		Collections.sort(list);		
		System.out.printf("LinkList Sorted: %s%nCalculated Sum: %s%nFloat Average: %s",list,Count(list),FloatAV(list));
		
	}	
	private static int Count(List<Integer> list)
	{
		int sum = 0;
		for(int count = 0;count < list.size();count++)
			sum += list.get(count);
		
		return sum;
	}
	private static float FloatAV(List<Integer> list)
	{
		float sum = Count(list);
		return sum/list.size();
	}
}
