import java.util.ArrayList;
//Stack.java
//custom stack "Stack"!
public class Stack <T>
{
	Stack()
	{
		//empty constr.
	}
	
	private int tracker = 0;
	
	private ArrayList<Object> set = new ArrayList<>();

	public void push(T element[])
	{	
		//IndexOutOfBoundsException Try and catch
		for(int x=0;x<element.length;x++)
		{	
			try
			{
			System.out.println(element[x] + "  has been pushed onto the Stack");
			set.add(element[x]);
			tracker++;
			}	
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
		}
	}
	
	public void pop()
	{			
		int count = (set.size() -1);
		
		while(count >= 0)
		{		
			System.out.println(set.get(count) + "  has popped off the stack");
			set.remove(count);
			count--;
			tracker--;
		}
	}
	
	public int size()
	{	
		return set.size();
	}
	
	public boolean isEmpty()
	{
		if(this.size() == 0)
		{
			System.out.println("The stack is empty (T/F): True");
			return true;
		}		
		else
		{
			System.out.println("The stack is empty (T/F): False");
			return false;
		}
	}
}
