package q2;

public abstract class Quadrilateral   //base class
{
	int base,height;
	abstract int area();
	public Quadrilateral()   //default constructor
	{
		base=1;
		height=1;
	}
	Quadrilateral(int base,int height)  //parameterized constructor
	{
		this.base=base;
		this.height=height;
	}
	
}
