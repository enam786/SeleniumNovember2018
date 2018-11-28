package homework2;

public class Computer {
	//Static variable
	public static int numbers; 
	
	//Non-Static variable
	public String Type;
	
	
	//Constructor 
	Computer(){
		this.Type = " Windows,Macs,Linux " ;
	 }
	
	// Constructor with parameter
	Computer(int numbers, String Type){
		this.numbers = numbers;
		this.Type = Type;
	}
    // Non-Static Method
	public void totalNumbers(int numbers) {
		this.numbers = numbers;
	}
	//Non-Static method
	 public int count() {
		 return numbers;
	 }
	 //Static Method
	 public static void component() {
		 System.out.println(" Hey, All components are working fine ");
	 } 
	 // Static Method
	 void display(){
		System.out.println(" Number of Computer :" + numbers+ " Machine Type :" + Type);
		 
	 }
	}



