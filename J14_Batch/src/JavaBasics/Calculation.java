//Implement a program to take two numbers and print their sum, difference, product, and quotient.
package JavaBasics;
import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Number: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println(a+" + "+b+" = "+(a+b));
		System.out.println(a+" - "+b+" = "+(a-b));
		System.out.println(a+" * "+b+" = "+(a*b));
		System.out.println(a+" / "+b+" = "+(a/b));
		System.out.println(a+" % "+b+" = "+(a%b));
		
		sc.close();
	}

}
