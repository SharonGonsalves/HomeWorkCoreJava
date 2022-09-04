package hw10UseOfSuperInChildClass;

//Use super method , super keyword and show all of their use in child class

public class Daughter extends Father {
	public String birthMonth;
	public int age;

	// Declare default constructor
	public Daughter() {

		super();
		super.father();
		super.fatherInfo("June", 15, 'F', true);

		super.familyName = "Gonsalves";

		System.out.println("The family name is : " + familyName);
		System.out.println("This is from default constructor");

	}
	/*
	 * Use super method, super keyword and show all of their use in child class. Use
	 * 'FamilyName' variable (from parent class) to initialize by super keyword in
	 * child class (Use one constructor and one method to implement them). and
	 * initialize in a TestFamily Class.
	 */

// Parameterized constructor -Local Variable
	public Daughter(String birthMonth, int age) {

		super();
		super.father();
		super.fatherInfo("Feb", 50, 'M', false);

		super.familyName = "Gonsalves";

		System.out.println("The family name is : " + familyName);
		System.out.println("This is from default constructor");

		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("This is parameterized constructor from Daughter class");
		System.out.println("BirthMonth: " + birthMonth + "Age " + age);

	}

	// Regular void type non-parameterized method
	public void daughter() {
		// we can not call constructor of super class inside a method of child class
		// super();
		super.father();
		super.fatherInfo("February", 50, 'M', false);

		super.familyName = "Gonsalves";

		System.out.println("The family name is : " + familyName);
		System.out.println("This is from default constructor");

		// we can't call constructor of super class inside a method of child class.
		// super();
		System.out.println("This regular method from Daughter class");
	}

	// This is parameterized method
	public void daughterInfo(String birthMonth, int age) {
		// we can not call constructor of super class inside a method of child class
		// super();
		super.father();
		super.fatherInfo("June", 20, 'F', true);

		super.familyName = "Gonsalves";

		System.out.println("The family name is : " + familyName);
		System.out.println("This is from default constructor");

		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("This is parameterized method from ");
		System.out.println("BirthMonth:" + birthMonth + "Age" + age);

	}
}
