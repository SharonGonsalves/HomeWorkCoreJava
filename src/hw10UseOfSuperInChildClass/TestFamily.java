package hw10UseOfSuperInChildClass;

public class TestFamily {

	public static void main(String[] args) {
		
		System.out.println("------------------ this is from default constructor of Daugther--------------\n");
		Daughter daughter = new Daughter();
		
		System.out.println("------------------ this is from default constructor of Daugther--------------\n");
		Daughter daughter2 = new Daughter("Sharon", 30);
		
		System.out.println("------------------ this is from regular method of Daugther--------------\n");
		daughter2.daughter();
		
		System.out.println("------------------ this is from perametarize method of Daugther--------------\n");
		daughter2.daughterInfo("Sharon", 30);
		
		System.out.println("------------------ this is from default constructor of Father--------------\n");
		Father father = new Father();
		
		System.out.println("------------------ this is from Perametarize Father--------------\n");
		Father father2=new Father(" Gonsalve", 50, 'M', true);
		
		System.out.println("------------------ this is from regular method of Father--------------\n");
		father2.father();
		
		System.out.println("------------------ this is from perametarize method of Father--------------\n");
		father2.fatherInfo("Gonsalves", 50, 'M', false);
		
		
		
		
		
		

	}

}
