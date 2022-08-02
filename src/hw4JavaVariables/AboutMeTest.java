/*Create another class AboutMeTest. Instantiate AboutMe class under main method. 
 *   Initialize variables and call the method by object. 
 *   I expect print outcome for 2 person, one for you 
 *   and another for your best friend Alex. give a single line comment where a variable is declared and 
 *   initialized, constructor is declared and initialized, method is implemented and initialized.
 *    Follow indentation by Organizing the code and push to the github and paste the link of github below. 
 */

package hw4JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {
		AboutMe angilique = new AboutMe(); // Instantiate AboutMe class under main method
		// Initialize variables:
		angilique.name = "Sharon";
		angilique.age = 30;
		angilique.myApartmentRent = 2000;
		angilique.myYearlySalary = 10000;
		angilique.myBankBalance = 12345678l;
		angilique.myHeight = 5.5f;
		angilique.myGrade = 3.75;
		angilique.sex = 'F';
		angilique.usCitizen = true;
		angilique.aboutMe();

		// call the method by object

		AboutMe obj = new AboutMe();
		obj.name = "Alex";
		obj.age = 35;
		obj.myApartmentRent = 2500;
		obj.myYearlySalary = 12000;
		obj.myBankBalance = 12567347;
		obj.myHeight = 6.0f;
		obj.sex = 'F';
		obj.usCitizen = true;
		obj.aboutMe();

	}

}