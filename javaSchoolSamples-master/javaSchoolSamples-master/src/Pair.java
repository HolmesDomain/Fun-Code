//Pair.java
//First Generic Class
public class Pair<F,S>
{
	private F a;
	private S b;
	
	public Pair()
	{
		//empty constuctor
	}
	
	public void setF(F f)
	{
		this.a = f;
	}
	
	public void setS(S s)
	{
		this.b = s;
	}
	//Is there a way to make a getMethod() that returns two values
	//-without printing? 
	public F getF()
	{
		return a;
	}
	
	public S getS()
	{
		return b;
	}
}
