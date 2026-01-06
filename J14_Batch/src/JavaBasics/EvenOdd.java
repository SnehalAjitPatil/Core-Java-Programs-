//Write a program to check whether a number is even or odd
package JavaBasics;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int a=sc.nextInt();
		if(a%2==0)
			System.out.println(a+" is even");
		else
			System.out.println(a+" is odd");
		sc.close();
	}

}
