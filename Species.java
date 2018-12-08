package homeworkOfOops_3;

public class Species {
	
	/*Polymorphism makes it possible to use the same entity in different forms. 
	 * In Java, this means that you can declare several methods with the same name until they 
	 * are different in certain characteristics. 
	 * Java provides us with two ways to implement 
	 * polymorphism: method overloading and method overriding.*/

	public void color( ) {
		System.out.println("The color of parrot is green");
			}
	
	public void hight() {
		System.out.println("The hight of parrot is low");  
		}
	
	public void hight(int height) {
		System.out.println("The height of Ostrich is " + height);  
	}
	public void talk() {
		System.out.println("The Ostrich can not talk");
	}
	
	public void production() {
		System.out.println("The Ostrich lay eggs");
	}
	  }

	

