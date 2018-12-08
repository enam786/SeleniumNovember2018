package homeworkOfOops_3;

/*Inheritance allows us to extend a class with child classes that inherit 
 * the fields and methods of the parent class. 
 * It’s an excellent way to achieve code re-usability. 
 * In Java, we need to use the extends keyword to create a child class.*/

/*the HummingBird class extends the AmericanBird parent class. 
 * It inherits all of its fields and methods,
  plus defines two extra fields that belong  to HummingBird.*/

// Here we are expanding regular class, do not confuse ;-) its possible
public class HummingBird extends AmericanBirds {
	
	
	public String name = "Bee HummingBird";
	private int lifespan = 1;
	
 
	public void size () {
		
		System.out.println("Smallest bird in the world");
	}
	 void population() {
		 
		 System.out.println("Total population is 1200000 in USA");
	 }
}
