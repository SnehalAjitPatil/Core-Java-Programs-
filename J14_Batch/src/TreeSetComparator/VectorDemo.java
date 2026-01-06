package sample;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector v1=new Vector();
		
		v1.add(123);
		v1.addElement("aaa");
		v1.add("xyz");
		v1.add(2,456);
		v1.add(789);
		v1.add("bbb");
		
		System.out.println(v1);
	}

}
