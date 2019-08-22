package myFirstJava;

public class getSetProgram 
{
	public static void main(String args[]) {
		myStudentProgram s=new myStudentProgram();
		s.setName("John");
		s.setID(21976);
		s.setDept("Master of Computer Applications");
		s.setGrade("Frist");
		System.out.println("************ The Student Details are below: **************");
		System.out.println("Name       : "+s.getName());
		System.out.println("ID         : "+s.getID());
		System.out.println("Department : "+s.getDept());
		System.out.println("Grade      : "+s.getGrade());
		System.out.println("**********************************************************");
		
		//s.name="Jack"; ****cannot access it ****private data member****
	}
}
