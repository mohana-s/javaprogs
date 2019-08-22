package myFirstJava;

public class ifCondition {
public static void main(String args[])
{
	int age=3;
	if(age<=18 && age>0)//if condition
	{
		if(age<=5) {//nested if condition
			System.out.println("The person is kid");
		}
		else
			System.out.println("The person is Junior");
	}
	else if(age>18 && age <= 60)//if..else ladder
	{
		System.out.println("The person is adult");
	}
	else if(age>60)
	{
		if(age>70) {
			System.out.println("The person is senior most citizon");
		}
		else
			System.out.println("The person is senior citizon");
		
	}
	else //if .. else statement
		System.out.println("The age is invalid");
	
		
}
}
