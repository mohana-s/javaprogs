package myFirstJava;
abstract class fruits{//abstract class
	fruits(){//constructor
		System.out.println("Constructor in Abstract Class");
	}
	abstract String getName();//abstract method **do not have body**
	String getColor() {//non abstract method
		String color="Green";
		return color;
	}
	int getPrice()
	{
		return 0;	
	}
}
class grapes extends fruits{
	grapes(){
		System.out.println("Constructor in Sub Class");
	}
	String getName() {
		String Name="Grapes";
		return Name;
	}
	int getPrice()//methods should be defined in abstract class
	{
		return 100;
	}
}
public class myJavaFamily {
	myJavaFamily(){
		System.out.println("Constructor in Main");
	}
	void getTaste()
	{
		System.out.println("The fruit taste is: Sweet");
	}
	public static void main(String args[]) {
		//fruits f=new fruits();  ****abstract class cannot be intantiated****
		fruits f=new grapes();
		myJavaFamily m=new myJavaFamily(); // Constractor in Main (myJavaFamily) 
		System.out.println("Name of the fruit is : "+f.getName());//abstract method
		System.out.println("Color of the fruit is : "+f.getColor());//non abstract method
		System.out.println("Price of the fruit is : "+f.getPrice());	
		m.getTaste();//method in myJavaFamily
}
}
