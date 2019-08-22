package myFirstJava;

public class findFactorial {
	public static void main(String args[])
	{
		int num=7;		
		findFactorial f=new findFactorial();		
		System.out.println("The factorial of "+num+" is: "+ f.factorialmethod(num));
	}
	public int factorialmethod(int num)
	{
		int fact=1;
		for (int i=num;i>=1; i--)//for loop
		{
			fact=fact*i;
			for(int j=i;j>=1;j--)//nested for loop
			{
				System.out.print("*");
			}		
			System.out.println(i);
		}
		//System.out.println();
		return fact;
	}

}
