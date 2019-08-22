package myFirstJava;

class banks{//parent class
	int bankid=0;
	float getInterestRate()
	{
		return 0f;
	}
}
class SBIbank extends banks{//Inheritance **Sub class**
	int bankid=1;
	float  getInterestRate()//Runtime Polymorphism ***method overridding**
	{
		return 7.8f;
	}
}
class Citibank extends banks{
	int bankid=2;//data member
	float  getInterestRate()
	{
		return 6.8f;
	}
}
class Yesbank extends banks{//multiple inheritance
	int bankid=3;
	float  getInterestRate()
	{
		return 8.8f;
	}
}
class CitiUnionbank extends Citibank{//multilevel inheritance
	int bankid=4;
	float  getInterestRate()
	{
		return 6.5f;
	}
}
public class myFirstJavaProgram {
	public static void main(String args[])
	{
		banks b1,b4;
		banks b2=new SBIbank();//upcasting - ref var of parent class which refers to subclass obj 	
		System.out.println("The SBI Bank Interest Rate is: "+b2.getInterestRate());
		//cannot override data member - here runtime polymorphism cannot be achieved.
		System.out.println("The SBI Bank ID is: "+b2.bankid);
		b1=new Citibank();//no upcasting
		System.out.println("The Citi Bank Interest Rate is: "+b1.getInterestRate());
		System.out.println("The Citi Bank ID is: "+b1.bankid);
		b1=new Yesbank();
		System.out.println("The Yes Bank Interest Rate is: "+b1.getInterestRate());
		System.out.println("The Yes Bank ID is: "+b1.bankid);
		b1=new banks();
		System.out.println("The Bank Interest Rate is: "+b1.getInterestRate());
		System.out.println("The Bank ID is: "+b1.bankid);
		b4=new CitiUnionbank();
		System.out.println("The CitiUnionBank Interest Rate is: "+b4.getInterestRate());
		System.out.println("The CitiUnionBank ID is: "+b4.bankid);
		
	}
	

}
