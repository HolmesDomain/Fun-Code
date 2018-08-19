//PairTest.java
//A basic test and example of how to use a generic object
public class PairTest {
	public static void main(String[] args) {
	System.out.println("Andrew Holmes – Assignment 7");
	
	Pair<Integer,String> p1 = new Pair<>();
	Pair<String,Integer> p2 = new Pair<>();
	
	//Set methods
	p1.setS("James' first Generic!");
	p1.setF(20);
	p2.setF("Batman of Gotham");
	p2.setS(11011001);
	
	//Get methods
	System.out.println("First Generic name: " + p1.getS());
	System.out.println("un-autoboxed Integer of the first Generic p1: " + p1.getF());
	System.out.println("Second Generic name: " + p2.getF());
	System.out.println("un-autoboxed Integer of the first Generic p2: " + p2.getS());


	}
}
