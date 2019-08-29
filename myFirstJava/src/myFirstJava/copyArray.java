package myFirstJava;

public class copyArray {
public static void main(String args[])
{
	char source[]= {'d','h','e','e','r','a','n',' '};
	char desti[]= new char[7];
	System.arraycopy(source, 1, desti, 0, 5);
	for(int i=0;i<desti.length;i++)
		System.out.println(desti[i]);
	
}
}
