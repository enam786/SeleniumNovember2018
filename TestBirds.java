package homeworkOfOops_3;

public class TestBirds {

	public static void main(String[] args) {
		
		//*****Abstraction & Interface(
		
		//Count interface object reference to penguin
		Count myCount1 = new Penguin ();
		    myCount1.inAmerica();
		    
		    //Count interface object reference to Falcon
		    Count myCount2 = new Falcon ();
		          myCount2.inAmerica();
		    
		    //Breed interface object reference to penguin
		    Breed myBreed = new Penguin();
		       myBreed.breedingMonth();
		       myBreed.breedingFormula();
		       myBreed.breedingMedicin();
		       
		       //Birds abstract class object reference to penguin
		        Birds myBirds = new Penguin();
		         myBirds.eat();
		         myBirds.label();
		       
		         //child class  penguin object
		         //From child class we can access method from super/parent means Abstract or Interface class
		        Penguin myPenguin = new Penguin();
		         myPenguin.eat();
		         myPenguin.inAmerica();
		         
		       //child class  Falcon object
		         Falcon myFalcon = new Falcon();
		            myFalcon.eat();
		           
		            //*******Abstraction)
		            
		            System.out.println("#####################");
		            
		    //*******Encapsulation object((
		            
		        
		            Penguin p1 = new Penguin ();
		             p1.setName("Empere Penguin");
		             p1.setAverageWeight(8.5);
		             p1.settypsOfcolor(5);
		             System.out.println(p1.getName()+ " "+p1.getAverageWeight()+ " "+p1.gettypesOfcolor());
		             
		             Penguin p2 = new Penguin ();
		             p2.setName("African Penguin");
		             p2.setAverageWeight(6.5);
		             p2.settypsOfcolor(3);
		             System.out.println(p2.getName()+ " "+p2.getAverageWeight()+ " "+p2.gettypesOfcolor());
		             
		             //CONSTRACTOR CLASS OBJECT
		             Penguin p3 = new Penguin ("King Penguin", 9, 2);
		              System.out.println(p3.getName()+ " "+p3.getAverageWeight()+ " "+p3.gettypesOfcolor());
		              
		              //*****Encapsulation))
		              
		              System.out.println("#####################");
		              
		              //****Inheritance object type(
		              
		               HummingBird bird = new HummingBird ();
		                   bird.speed();
		                   bird.population();
		                   bird.flyup();
		                   
		                   //****)
		                   
		                   System.out.println("#####################");
		                   
		                   //******Polymorphism object class((((
		                   
		                   // Method Overloading
		                   /*Method overloading means that you can have several 
		                    * methods with the same name within a class. 
		                    * However, the number, names, or types of 
		                    * their parameters need to be different.*/
		                   Species sp = new Species();
		                    sp.color();
		                    sp.hight(6); // here overloading happened, took second method
		                    sp.talk();
		                    
		                    
		                    //Method Overwriting               
		                    /*By using the method overriding feature of Java, 
		                     * you can override the methods of a parent class from its child class.*/
		                    Crane_polym cp = new Crane_polym();
		                          cp.color("white");
		                          cp.talk(true); // here overwriting happened, took Crane_polym class method
		                          
		                          //******))))
		                          
		                    
		                   
		                   

	}

}
