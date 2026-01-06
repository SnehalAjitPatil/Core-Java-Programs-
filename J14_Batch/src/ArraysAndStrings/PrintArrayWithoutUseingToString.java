//Write a program to print an array without using toString() method

package ArraysAndStrings;

import java.util.Arrays;

public class PrintArrayWithoutUseingToString {

	public static void main(String[] args) {
		int[] arr= {3,9,6,1,2};
		System.out.println("Array: "+Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
