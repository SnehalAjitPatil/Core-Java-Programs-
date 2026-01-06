//Write a program to find the largest element in an array.

package ArraysAndStrings;

import java.util.Arrays;

public class LargestElementInArray {

	public static void main(String[] args) {
		int[] arr= {3,9,6,1,2};
		System.out.println("Array: "+Arrays.toString(arr));
		int max=arr[0];
		for(int i=1;i<=arr.length-1;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Max value: "+max);
		
	}

}
