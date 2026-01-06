//Implement a program to reverse an array.

package ArraysAndStrings;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr= {3,9,6,1,2};
		System.out.println("Array: "+Arrays.toString(arr));
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
