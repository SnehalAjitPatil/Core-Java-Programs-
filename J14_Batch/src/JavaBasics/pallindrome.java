//Implement a program to check whether a number is a palindrome
package JavaBasics;

import java.util.Scanner;

public class pallindrome {

	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter a Number: ");
				int a=sc.nextInt();
				int num=a;
				int reverse=0;
				
				while(num!=0)
				{
					int digit=num%10;
					reverse=reverse*10+digit;
					num/=10;
				}
				if(a==reverse)
					System.out.println(a+" is palindrome");
				else
					System.out.println(a+" is not palindrome");
	}
}
