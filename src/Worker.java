
public class Worker implements Behaviours {

	@Override
	public void greet() {
		System.out.println("Hello sir welcome to Royal Burger!");
		
	}

	@Override
	public void order() {
		System.out.println(" ");
		System.out.println("What would you like to order? ");
		
	}

	@Override
	public void bye() {
		System.out.println(" ");
		System.out.println("Thank you sir enjoy your meal, see you next time! ");
		
	}

}
