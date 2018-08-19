class Rectangle {
private float width = 1;
private float length = 1;
	//Reactangle Class
	//constructor
	public void Rectangle()
	{}
	//class methods
	public float perimeter(float width, float length)
	{
		float goal;
		return goal = (width*2) + (length*2); 
	}
	
	public float area(float width, float length)
	{
		float goal1;
		return goal1 = width * length;
	}
	//setter
	public float setWidth(float width)
	{
		if(width <= 0 || width >= 20)
		{
			throw new IllegalArgumentException("Incorrect width");
		}
		return this.width = width;
	}
	
	public float setLength(float length)
	{
		if(length <= 0 || length >= 20)
		{
			throw new IllegalArgumentException("Incorrect length");
		}
		return this.length = length;
	}
	//getter
	public float getWidth()
	{
		return this.width;
	}
	
	public float getLength()
	{
		return this.length;
	}
}
