//Write a program to remove duplicate elements from an array

package ArraysAndStrings;

import java.util.*;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Integer[] arr= {3,9,6,1,2,3,6,5,3,2};
		Set<Integer> lhs=new LinkedHashSet<>(Arrays.asList(arr));
		Integer[] uniquenumbers=lhs.toArray(new Integer[0]);
		System.out.println(Arrays.toString(uniquenumbers));
	}

}
