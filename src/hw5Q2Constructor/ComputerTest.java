package hw5Q2Constructor;

public class ComputerTest {
	public static void main(String[] args) {

//default Constructor is initialized
		Computer computer = new Computer();// default Constructor is initialized
//Here 'Apple' is an argument ,in the Computer class, computeBrand was a parameter and that is String type 
//Parameterized Constructor 01 is initialized 
		Computer computer1 = new Computer("Apple", "MacBookAir", "MacOSMojave", 800, 'A', false);
		// Parameterized constructor 01 initialize
		Computer computer2 = new Computer(12.000, "HP", "HPNotebook", "Windows", 'A', true);

	}
}