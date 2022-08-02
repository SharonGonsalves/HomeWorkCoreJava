/*Create a Class name "AboutMe". Declare String and other 8 types of variable. Create a constructor and 
 * Give a sysout inside Constructor which will print "This is all about us: ". Then Create a method name
 *  aboutMe. Inside the method -use String and other 8 types of variables inside sysout to define a person's
 *   meaningful info. */

package hw4JavaVariables;

public class AboutMe {

// Variables,  methods(),  constructor 
	public String name;// variable Declare
	public byte age;
	public short myApartmentRent;
	public int myYearlySalary;
	public long myBankBalance;
	public float myHeight;
	public double myGrade;
	public char sex;
	public boolean usCitizen;

// Constructor Declared
	public AboutMe() {
		System.out.println("This is all about us: ");

	}

	// method implemented
	public void aboutMe() {
		System.out.println("My Name is:" + name + " \nMy Age:" + age + "\n MyApartmentRent " + myApartmentRent
				+ "\nMyYearlySalary:" + myYearlySalary + "\nMyBankBalance:" + myBankBalance + "\nMy Height:" + myHeight
				+ "MyGrade:" + myGrade);

	}

}

