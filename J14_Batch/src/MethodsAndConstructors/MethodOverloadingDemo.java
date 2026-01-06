//Write a program to demonstrate method overloading.

package MethodsAndConstructors;

public class MethodOverloadingDemo {

	private int x=0,y=0,z=0;
	
	
	public MethodOverloadingDemo() {
		super();
	}

	public int getZ() {
		return z;
	}


	public void setZ(int z) {
		this.z = z;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}
    
	public int sum() {
		return (x+y+z);
	}
	public int sum(int x, int y) {
		return (x+y+z);
	}
	public int sum(int x, int y, int z) {
		return (x+y+z);
	}

	public static void main(String[] args) {
		MethodOverloadingDemo obj=new MethodOverloadingDemo();
		System.out.println("result of obj.sum() = "+obj.sum());
		System.out.println("result of obj.sum(4,5) = "+obj.sum(4,5));
		System.out.println("result of obj.sum(6,7,8) = "+obj.sum(6,7,8));
	}

}
