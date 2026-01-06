//Implement a program to check whether a number is prime.

package JavaBasics;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int a=sc.nextInt();
		if(isprime(a))
		{
			System.out.println(a+" is Prime Number");
		}
		else
		{
			System.out.println(a+" is not prime number");
		}
		
	}

	private static boolean isprime(int a) {
		if(a<=1)
			return false;
		if(a==2 || a==3)
			return true;
		if(a%2==0||a%3==0)
			return false;
		for(int i=5;i*i<=a;i+=6)
		{
			if(a%i==0 || a%(i+2)==0)
				return false;
		}
		return true;
	}

}
