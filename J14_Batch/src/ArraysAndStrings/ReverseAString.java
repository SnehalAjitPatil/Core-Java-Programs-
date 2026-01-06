//Write a program to reverse a string without using StringBuilder

package ArraysAndStrings;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str=sc.next();
		String reverse=reverseString(str);
		System.out.println("Reverse String: "+reverse);
	}

	private static String reverseString(String str) {
		String reversed="";
		for(int i=str.length()-1;i>=0;i--)
			reversed+=str.charAt(i);
		return reversed;
	}

}
