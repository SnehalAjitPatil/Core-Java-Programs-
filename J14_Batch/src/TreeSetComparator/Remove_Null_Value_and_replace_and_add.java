package sample;
import java.util.*;
public class Remove_Null_Value_and_replace_and_add {
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		al.add(123);
		al.add("aaa");
		al.add(null);
		al.add(456);
		al.add("bbb");
		al.add(789);
		al.add("ccc");
		
		System.out.println(al); 
		
		ListIterator ltr=al.listIterator();
		while(ltr.hasNext())
		{
			if(ltr.next()==null)
			{
				ltr.set("hello");
				ltr.add("ddd");
			}	
		}
		System.out.println(al);
	}

}
