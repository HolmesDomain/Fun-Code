package Five2;
import java.util.*;
//A5Two.java
//Copy then reverse a LinkedList
public class A5Two {
	public static void main(String[] args) {
		System.out.println("Andrew Holmes – Assignment 5-2\n");
		List<Character> one = new LinkedList<>();
		List<Character> two = new LinkedList<>();
		char[] a = new char[]{'a','b','c','d','e','f','g','h','i','j'};
		
		for(Character count : a)
			one.add(count);
		
		two.addAll(one);
		Collections.reverse(two);
		
		System.out.printf("LinkedList one: %s%nLinkedList two: %s",one,two);
	}

}
