package q4;

public class FindArray 
{
	public void findArray(Integer arr[],int a) //traverses through the array
	{
		Listener ob = new Listener() {
			
			@Override
			public void func(int index) {
				// TODO Auto-generated method stub
				if(index!=0)
					System.out.println("Number found at index"+index);
				else
					System.out.println("Number not found");			
			}
		};
		int i;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i].equals(a))
			{	ob.func(i); break;}
		}
		if(i==arr.length)
			ob.func(0);		
		
	}
	
	

}
