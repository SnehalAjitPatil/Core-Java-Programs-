//Implement a program to check whether two strings are anagrams

package ArraysAndStrings;

import java.util.Scanner;

public class TwoStringsAreAnagrams {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Strings: ");
		String str1=sc.next();
		String str2=sc.next();
		System.out.println("String 1: "+str1+"   "+"String 2: "+str2);
	    if(isAnagram(str1,str2))
	    {
	    	System.out.println("Two Strings are Anagram");
	    }
	    else
	    {
	    	System.out.println("Two Strings are not Anagram");
	    }

	}

	public static boolean isAnagram(String str1, String str2) {
		if(str1.length()!=str2.length())
			return false;
		int[] count=new int[256];	//for ASCII charcters
		for(int i=0;i<str1.length();i++)
		{
			count[str1.charAt(i)]++;
			count[str1.charAt(i)]++;
		}
		for(int c:count)
			if(c==0)
				return true;
		return true;
	}

}
