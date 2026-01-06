//Write a program to find the sum of digits of a number.
package JavaBasics;

import java.util.Scanner;

public class SumOfDigitInNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int a=sc.nextInt();
		int sum=0;
		while(a!=0)
		{
			sum+=a%10;
			a/=10;
		}
		System.out.println("Sum of Digits of a Number= "+sum);
	}

}
