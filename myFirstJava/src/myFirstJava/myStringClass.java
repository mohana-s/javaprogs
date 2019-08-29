package myFirstJava;

public class myStringClass {

	public static void main(String args[])
	{
	String s1="Hello";
	String s2="World";
	String s4=new String("bye");
	String s3;
	char c[]={'h','e','l','l','o'};
	//String s3;
	s3=new String(c);
	s1="see you";
	//s3=new String("see you");
	System.out.println(s1 + s2 + s3+s4);
	s1=s1.concat("test");
	System.out.println(s1);
	System.out.println(s1.length());
	System.out.println(s3.compareTo("hello"));
	System.out.println(s1.equals(s3));
	System.out.println(s1.toUpperCase());
	}
	
}
