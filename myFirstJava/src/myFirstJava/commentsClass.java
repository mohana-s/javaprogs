package myFirstJava;
/** The Calculator class provides methods to get addition and subtraction of given 2 numbers.*/  
class Calculator {  
/** The add() method returns addition of given numbers.*/  
int add(int a, int b){return a+b;}  
/** The sub() method returns subtraction of given numbers.*/  
int sub(int a, int b){return a-b;}  
}  
public class commentsClass {
	public static void main(String args[]) {
		Calculator c= new Calculator();
		System.out.println("Addition:" + c.add(10, 10));
		System.out.println("Addition:" + c.sub(20, 10));
	}

}
