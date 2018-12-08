package homeworkOfOops_3;

/*Extend the Birds abstract class with two child classes: Falcon and Penguin.
 *  Both of them set up their own functionality for
 *   the fly() and eat() abstract methods. */

/* Java interfaces allow us to implement multiple inheritance in our code, 
 * as a class can implement any number of interfaces. 
 * Classes can access an interface using the implements keyword. */

public class Falcon extends Birds implements Breed, Count {
	
	// Not using access modifier here 
	void fly() {
		 System.out.println("Moves by flying.");
    }
	void eat() {
		 System.out.println("Eats birdfood.");
}
	
	public void inAmerica() {
		
		 System.out.println(" In America fly as many as 15,500 Falcons");	
	}
	
	public void breedingMonth() {
		 System.out.println("Falcon breeding season and will vigorously defend their nests");
		
	}
	
	public void breedingFormula() {
		 System.out.println("Falcon male and female incubate the eggs for about one month");
		
	}
	
	public void breedingMedicin() {
		 System.out.println("Falcon breeding medicine is unknown");
		
	}
}
