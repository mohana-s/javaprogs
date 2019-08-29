package myFirstJava;
class findMin
{
	int findMinValue(int arr[]) {
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(min>arr[i])
				min=arr[i];
		}
			return min;
	}	
}
public class findMinValueUsingArray {
	
	public static void main(String rgs[])
{
	int input[]= {10,5,15,3,30,60,1};
	findMin f=new findMin();
	System.out.println("Mininum value is: "+f.findMinValue(input));
}
}
