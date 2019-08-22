package myFirstJava;

public class myStudentProgram {
		 private String name,dept,grade;//data hiding
		 private int id;
		 public void setName(String name)//setter method to set name
		 {
			 this.name=name;
			 
		 }
		 public String getName() {//getter method to get name
			 return name;
		 }
		 public void setID(int id)
		 {
			 this.id=id;
			 
		 }
		 public int getID() {
			 return id;
		 }
		 public void setDept(String dept)
		 {
			 this.dept=dept;
			 
		 }
		 public String getDept() {
			 return dept;
		 }
		 public void setGrade(String grade)
		 {
			 this.grade=grade;
			 
		 }
		 public String getGrade() {
			 return grade;
		 }
	 }


