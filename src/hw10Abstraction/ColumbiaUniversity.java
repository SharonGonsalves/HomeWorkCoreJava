package hw10Abstraction;

/* 1. How many keywords are used for the inheritance in Java for a regular Class ?
 * 
 * Ans: 2 keywords:extands and implements keywords are used for the interface in Java for Class.
 * 
 * 2. Can a regular Class inherit other Abstract Class or interface by extends key word?
 * 
 * Ans: For regular class or a Abstract class: Yes: can inherit by extends keyword 
 * For interface class: No: for interface inherit by implements keyword .
 * 
 * 3. How many inheritances is possible by regular Class ?
 * 
 * Ans: A regular class can inherit 1 or more than 1 interface class by implements keyword
 * 
 */

public abstract class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {
	// Yes, we can create a Constructor inside a regular Class
	ColumbiaUniversity() {

	}
// The abstract method chemistry not allowed in regular Class 
	// public abstract void chemistry();

	public void biology() {
		System.out.println();
	}

	public void anatomyLab() {// From Medical School

	}

	public void hygiene() {
	}

	public void commonRoom() {

	}

	public void laboratory() {
	}

	public void languageClub() {

	}

	public void emergencyRoom() {
	}

	public void surgeryRoom() {
	}

	public void cafeteria() {
	}

	public void lawInfo() {
	}

	public void vacationalSchool() {
	}

	public void classSize() {
	}

	public void playGround() {
	}

	public void teacher() {

	}
}
