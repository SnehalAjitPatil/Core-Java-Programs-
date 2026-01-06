//Write a program to count the frequency of each element in an array.

package ArraysAndStrings;

import java.util.Arrays;

public class CountFrequencyOfEachElementInArray {

	public static void main(String[] args) {
		int[] arr= {3,9,6,1,2,3,6,5,3,2};
		countFrequency(arr);
	}

	public static void countFrequency(int[] arr) {
		Arrays.sort(arr);
		int n=arr.length;
		
		for(int i=0;i<n;i++)
		{
			int count=1;
			while(i<n-1 && arr[i]==arr[i+1])
			{
				i++;
				count++;
			}
			System.out.println("Frequency Count of "+arr[i]+" is "+count);
		}
		
		
	}

}
