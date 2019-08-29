package myFirstJava;

public class iterationProgram {
	public static void main(String args[])
	{
		first:for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==2)
					continue;//
				else
					System.out.println(i);
			}
		}
	iterationProgram obj=new iterationProgram();
	obj.test(5);
	System.out.println("Ending");

	}
	void test(int x)
	{
		System.out.println(x);
		for(int i=1;i<=x;i++)
		{
			if(i==2)
				return;//ctrl will return to calling method
			System.out.println(i);
		}
		System.out.println(x);
	}
}
