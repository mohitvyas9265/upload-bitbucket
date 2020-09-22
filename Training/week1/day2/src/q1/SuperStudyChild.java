package q1;

public class SuperStudyChild extends SuperStudy
{
	public void X()
	{
		    		//problem is that it will be recursively called causing stack overflow
		super.X();	//To call parent function
		System.out.println("I am in SuperStudyChild.X()");
	}
	public static void main(String[] args) 
	{
		SuperStudyChild ob = new SuperStudyChild();
		ob.X();
	}
}
