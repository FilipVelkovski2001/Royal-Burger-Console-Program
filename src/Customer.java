
public class Customer implements Behaviours{

	
	@Override
	public void greet() {
		System.out.println(" ");
		System.out.println("Hello can i make my order?");
		
		
	}

	@Override
	public void order() {
		System.out.println(" ");
		System.out.println("I would like to order:");
		
		
	}

	@Override
	public void bye() {
		System.out.println(" ");
		System.out.println("Thank you very much, goodbye have a nice day!");
		
		
	}

}
