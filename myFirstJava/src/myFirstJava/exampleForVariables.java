package myFirstJava;

public class exampleForVariables {
	int a1=10; //instance variable
	static int b1=20;//static variable
	public static void main(String args[])
	{
		int c1=30; //local variable
		int d=b1+c1;
		System.out.println("The value is: "+d);
		float e=1.2f;
		float f=2.14f;
		float g= e+f;
		System.out.println("The value is(float): " + g);
		int h= (int)g;
		System.out.println("The value is(int): " + h);
	}
	
	
}
