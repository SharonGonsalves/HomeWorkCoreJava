package hw4JavaVariables;

public class AboutMe {
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
		AboutMe angilique = new AboutMe();
		System.out.println(angilique.name);
		System.out.println("My Name:" + angilique.name + " \nMy Age:" + angilique.age + "\nMyapartmentRent " + angilique. myApartmentRent);
	
	}	
	
}

