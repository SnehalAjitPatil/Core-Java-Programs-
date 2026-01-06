/**
 * 
 */
package sample;
import java.util.*;

/**
 * @author Shree
 *
 */
public class sample {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Hii");
		al.add("Hello");
		al.add(123);
		al.add("World");
		al.add(456);
		System.out.println(al);
		
		al.add(1,"Everyone");
		System.out.println(al);
		
		ArrayList al1=new ArrayList();
		al1.addAll(al);
		System.out.println(al1);
		
		al.set(2, 987);
		System.out.println(al.get(2));
		System.out.println(al.indexOf(456));
		
		al.remove("Hii");
		System.out.println(al);
		
		Integer i=987;
		al.remove(i);
		System.out.println(al);
		
	}

}
