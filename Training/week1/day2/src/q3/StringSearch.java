package q3;

public class StringSearch extends AbstractSearch
{
	public boolean search(Object[] obj_list,Object o)
	{
		for(int i=0;i<obj_list.length;i++)
		{
			if(obj_list[i].equals(o))
				return true;
		}
		return false;
	}
}
