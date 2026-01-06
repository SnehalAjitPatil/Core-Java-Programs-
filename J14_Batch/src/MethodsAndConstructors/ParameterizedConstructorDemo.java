//Implement a program using a parameterized constructor.

package MethodsAndConstructors;

public class ParameterizedConstructorDemo {

	private int x=0,y=0;

	public ParameterizedConstructorDemo(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int sum() {
		return (x+y);
	}

	public static void main(String[] args) {
		ParameterizedConstructorDemo obj=new ParameterizedConstructorDemo(6,7);
		System.out.println("Summation of 6,7 is "+obj.sum());
	}

}
