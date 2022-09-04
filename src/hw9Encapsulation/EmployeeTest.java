package hw9Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emlpoyee = new Employee();
		emlpoyee.setName("Sharon Gonsalves");
		emlpoyee.setAge(30);
		emlpoyee.setSex('F');
		emlpoyee.setUsCitizen(false);

		System.out.println("Employee Name:" + emlpoyee.getName() + "\nEmployee Age: " + emlpoyee.getAge()
				+ "\nEmployee Sex:" + emlpoyee.getSex() + "\nEmployee UsCitizen:" + emlpoyee.isUsCitizen());

	}
}
