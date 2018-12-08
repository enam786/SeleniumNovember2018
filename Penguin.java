package homeworkOfOops_3;

/*Extend the Birds abstract class with two child classes: Falcon and Penguin.
 *  Both of them set up their own functionality for
 *   the fly() and eat() abstract methods. */

/* Java interfaces allow us to implement multiple inheritance in our code, 
* as a class can implement any number of interfaces. 
* Classes can access an interface using the implements keyword. */

public class Penguin extends Birds implements Count, Breed {
	
	//Encapsulation  variable*******(
    /*With encapsulation, you can protect the fields of a class. 
     * To do so, declare the fields as private and providing
     *  access to them with getter and setter methods.*/
	private String name;
	private double averageWeight;
	private int typesOfcolor;
	// **************)
	
	// CONSTRUCTOR For Encapsulation
		public Penguin() {}
		
		public Penguin(String name, double averageWeight, int typesOfcolor) {
			this.name = name;
			this.averageWeight = averageWeight;
			this.typesOfcolor = typesOfcolor;
			}
	
	
	//Abstraction + Interface ***********((
	public void walk () {
		   System.out.println("Penguin can walk");		 
				 }
	
	void fly() {
		 System.out.println("Moves by swimming.");
     }
	
	  public void eat() {
		 System.out.println("Eats seafood.");
	 }


	public void breedingMonth() {
		System.out.println("penguins breed annually during the antarctic winter, June through August.");
		
	}

	
	public void breedingFormula() {
		System.out.println("Penguin breeding may begin at three to four years");
		
	}

	
	public void breedingMedicin() {
		System.out.println("the father penguin feeds it a substance composed of 59% protein and 28% lipid");
		
	}

	
	public void inAmerica() {
		System.out.println("Penguin population in Antarctica is 12 million.");
		
	}
	// Abstraction + Interface***************))
	
	//***Encapsulation(((
	
	// Getter methods
		public String getName() {
			return name;
		}
		public double getAverageWeight() {
			return averageWeight;
		}
		public int gettypesOfcolor() {
			return typesOfcolor ;
		}

		// Setter methods
		public void setName(String name) {
			this.name = name;
		}
		public void setAverageWeight(double averageWeight) {
			this.averageWeight = averageWeight;
		}
		public void settypsOfcolor(int typesOfcolor) {
			this.typesOfcolor = typesOfcolor;
		}
		//****Encapsulation)))
}
