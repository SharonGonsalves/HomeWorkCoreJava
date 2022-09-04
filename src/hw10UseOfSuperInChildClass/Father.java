/*Create a class name Father. declare 5 variable like Name, age, sex, usCitizen, FamilyName.
 *  Declare default (declare a sysout inside it) and parameterized constructor (declare a sysout inside it) 
 *  from the first 4 variables. Create a regular void type method name father() which is implemented,
 *   declare a sysout inside it. Create a parameterized method fatherInfo() which also contain it's 4 variables, 
 *   declare a sysout (you can copy from parameterized constructor if you want)*/

package hw10UseOfSuperInChildClass;

public class Father {
	//declared 5 Global variable 
	
	public String name ;
	public int age ;
	public char sex;
	public boolean usCitizen;
	public String familyName ;
	
	//Declare default constructor 
	public Father() {
		System.out.println("This comment is from Default constructor in Father class");
	}
	
	//parameterized constructor 
	public Father(String name, int age , char sex, boolean usCitizen ) {
		this.name=name;
		this.age=age;
		this.sex=sex;
		this.usCitizen=usCitizen;
	
		
		System.out.println("This is parameterized constructor from Father class");
		System.out.println("Name: " + name +" Age: " + age + "Sex" + sex + "USCitizen" + usCitizen );}
		
		// Regular void type method 
		public void father() {
			System.out.println("This void type method from Father class");
		}
		// This is parameterized method 
		public void fatherInfo( String name,int age,char  sex , boolean usCitizen) {
			this.name=name;
			this.age=age;
			this.sex=sex;
			this.usCitizen=usCitizen;
			System.out.println(" This is parameterized method from Father class");
			System.out.println("Name:"+ name + "Age: " + age  + " Sex:"+ sex +"USCitizen " + usCitizen);
			
		}
	}
		
	


