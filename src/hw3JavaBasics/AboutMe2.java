
package hw3JavaBasics;
public class AboutMe2 {
	public String name = "Angilique";// variable initialized
	public String name1;// variable declared
	public byte age = 127;
	public short myApartmentRent = 32767;
	public int myYearlySalary = 1234567890;
	public long myBankBalance = 123456789875675l;
	public float myHeight = 2.356789f;
	public double myGrade = 3.2567897665;
	public char sex = 'F';
	public boolean usCitizen = false;

	public static void main(String[] args) {
		AboutMe2 aboutme2 = new AboutMe2();
		System.out.println(aboutme2.name);
		System.out.println("My Name:" + aboutme2.name + " \nMy Age:" + aboutme2.age + "\nMyapartmentRent:" + aboutme2. myApartmentRent);

		

	}
}

