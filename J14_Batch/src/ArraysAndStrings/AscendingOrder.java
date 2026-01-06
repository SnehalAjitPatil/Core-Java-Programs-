//Implement a program to sort an array in ascending order (without using Arrays.sort)

package ArraysAndStrings;

import java.util.Arrays;

public class AscendingOrder {

	public static void main(String[] args) {
		int[] arr= {3,9,6,1,2};
		System.out.println("Array before Sorting: "+Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Array after Sorting: "+Arrays.toString(arr));
	}

}
