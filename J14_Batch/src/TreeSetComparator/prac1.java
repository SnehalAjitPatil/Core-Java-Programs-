package sample;
import java.util.*;

public class prac1 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);

		/*ListIterator itr=al.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
		
		//problem 1 & 3
		Iterable<Integer> itr=al;
		int count = 0;
		for(Integer id:itr)
		{
			count++;
			System.out.println(id);
		}
		System.out.println(count);
		
	}

}
