//Implement a program to find the second largest element in an array.

package ArraysAndStrings;

import java.util.Arrays;

public class SecondLargestElementInArray {

	public static void main(String[] args) {
		int[] arr= {3,9,6,1,2};
		System.out.println("Array: "+Arrays.toString(arr));
		int max=arr[0];
		int secondMax=arr[0];
		for(int i=1;i<=arr.length-1;i++)
		{
			if(arr[i]>max)
			{
				secondMax=max;
				max=arr[i];
			}
			else if(arr[i]>secondMax && arr[i]!= max)
				secondMax=arr[i];
		}
		System.out.println("Second Max value: "+secondMax);
		
	}

}
