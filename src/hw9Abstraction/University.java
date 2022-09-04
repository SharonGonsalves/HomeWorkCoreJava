package hw9Abstraction;

//can you create a constructor inside university interface?
//No, we cannot have a constructor within an interface in Java 
// University(){}

/*1.how many keywords are used for the inheritance in interface ?
 * Ans: 2 keywords: one is implements keyword and another is extends keyword. 
 * 
 * 2. Can an interface inherit other interfaces, or a regular class or abstract class by the extends key word?
 * 
 *  Ans: Yes: an interface can inherit other Interface by extends key word. But can't inherit a regular class or abstract
 *  class by extends key word. 
 *  
 *  3.How many inheritance is possible ?
 *  
 *  Ans: An interface can inherit one or more than one interface by using extends keyword.
 * 
 */

public interface University extends College, Hospital {

	public void classSize();

	public void playGround();

	public void teacher();

	public default void gymnasium() {

	}

	public static void library() {

	}

}
