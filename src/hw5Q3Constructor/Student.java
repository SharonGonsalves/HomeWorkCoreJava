package hw5Q3Constructor;


public class Student {
	
	public String studentName;
	public int studentID;
	public char sex;
	public boolean javaProgrammer;
	public float grade;
	
	public Student(){
System.out.println("This is from default constructor of Student class");

}
public Student(String studentname, int studentID, char sex, boolean javaProgrammer, float grade){	
	this.studentName =studentname;
	this.studentID = studentID;
	this.sex = sex;
	this.javaProgrammer =javaProgrammer;
	this.grade =grade;
	System.out.println("Student Name:" + studentname +"\nID:" +studentID + "\nSex:" + sex + "\nGrade:" + grade +" \nJava Programmer:"+ javaProgrammer);
	
	
}	
}	