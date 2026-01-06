package MapAPI;

import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) {
		WeakHashMap<StringBuffer,Integer> whm=new WeakHashMap<>();
		
		StringBuffer k1=new StringBuffer("AAA");
		StringBuffer k2=new StringBuffer("BBB");
		StringBuffer k3=new StringBuffer("CCC");
		StringBuffer k4=new StringBuffer("DDD");
		
		whm.put(k1, 123);
		whm.put(k2, 456);
		whm.put(k3, 789);
		whm.put(k4, 852);
		
		System.out.println("Before Calling Garbage Collector: "+whm);
		
		k3=null;
		
		System.gc();
		
		System.out.println("After Calling Garbage Collector: "+whm);
		
	}

}
