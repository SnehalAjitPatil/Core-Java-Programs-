//Implement a program to find the largest of three numbers using if-else.

package JavaBasics;

import java.util.Scanner;

public class LargestOfThreeNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Three Numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a>b || c>b)
		{
			if(a>c)
				System.out.println(a+" is largest number");
			else
				System.out.println(c+" is largest number");
		}
		else
		{
			System.out.println(b+" is largest number");
		}
		sc.close();
	}
	
}
