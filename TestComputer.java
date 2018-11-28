package homework2;



public class TestComputer {

	  	public static void main(String[] args) {
			 Computer myComputer = new Computer();
			myComputer.totalNumbers(10);
			System.out.println(" we  need " + myComputer.count() + " Computer");
			
			System.out.println(myComputer.Type);
			
			//parameterized constructor object
			Computer obj = new Computer(5, " MACS ");
			obj.display();
			
			
			Computer yourComputer = new Computer();
			yourComputer.totalNumbers(7);
			System.out.println(" you need " + yourComputer.count()+ " Computer ");
			System.out.println(" we  need " + myComputer.count() + " Computer ");
			
			Computer.component();

		}

	}


