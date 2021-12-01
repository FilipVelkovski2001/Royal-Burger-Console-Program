
public class Menu {
	
	protected String hamburger;
	protected String cheeseburger;
	protected String royalburger;
	protected String crispychicken;
	protected String cheesechicken;
	
	
	protected int hamburgerPrice;
	protected int cheeseburgerPrice;
	protected int royalburgerPrice;
	protected int crispychickenPrice;
	protected int cheesechickenPrice;
	
	
	

	public void setBurgers(String hamburger, String cheeseburger, String royalburger, String crispychicken, String cheesechicken ) {
		
		this.hamburger = hamburger;
		this.cheeseburger = cheeseburger;
		this.royalburger = royalburger;
		this.crispychicken = crispychicken;
		this.cheesechicken = cheesechicken;
	}
	
	public void setBurgersPrice(int hamburgerPrice, int cheeseburgerPrice, int royalBurgerPrice, int crispychickenPrice, int cheesechickenPrice  ) {
		
		this.hamburgerPrice = hamburgerPrice;
		this.cheeseburgerPrice = cheeseburgerPrice;
		this.royalburgerPrice = royalBurgerPrice;
		this.crispychickenPrice = crispychickenPrice;
		this.cheesechickenPrice = cheesechickenPrice;
		
	}
	
	public void showBurgerMenu() {
		
		System.out.println("");
		System.out.println("Burger Menu: ");
		System.out.println(this.hamburger + ": "+ this.hamburgerPrice+ " den");
		System.out.println(this.cheeseburger + ": "+ this.cheeseburgerPrice+ " den");
		System.out.println(this.royalburger + ": "+ this.royalburgerPrice+ " den");
		System.out.println(this.crispychicken + ": "+ this.crispychickenPrice+ " den");
		System.out.println(this.cheesechicken + ": "+ this.cheesechickenPrice +" den");
		
	}
	
protected String[] drinks = new String[5];
	
	protected int[] drinksPrice = new int[5];

	public void setDrinks(String pepsi, String zup, String mirinda, String iceTea, String beer  ) {
		
		this.drinks[0] = pepsi;
		this.drinks[1] = zup;
		this.drinks[2] = mirinda;
		this.drinks[3] = iceTea;
		this.drinks[4] = beer;
		
	}
	
	public void setDrinksPrice(int pepsiPrice, int zupPrice, int mirindaPrice, int iceTeaPrice, int beerPrice) {
		
		this.drinksPrice[0] = pepsiPrice;
		this.drinksPrice[1] = zupPrice;
		this.drinksPrice[2] = mirindaPrice;
		this.drinksPrice[3] = iceTeaPrice;
		this.drinksPrice[4] = beerPrice;
		
	}
	
	public void showDrinksMenu() {
		
		System.out.println("");
		System.out.println("Drinks Menu: ");
		System.out.println(this.drinks[0] + ": " + this.drinksPrice[0] + " den");
		System.out.println(this.drinks[1] + ": " + this.drinksPrice[1] + " den");
		System.out.println(this.drinks[2] + ": " + this.drinksPrice[2] + " den");
		System.out.println(this.drinks[3] + ": " + this.drinksPrice[3] + " den");
		System.out.println(this.drinks[4] + ": " + this.drinksPrice[4] + " den");
		
	}
	protected String[] fries = new String[5];
	protected int[] friesPrice = new int [5];
	
	public void setFries(String small, String medium, String large, String mediumCanoe, String largeCanoe) {
		
		this.fries[0] = small;
		this.fries[1] = medium;
		this.fries[2] = large;
		this.fries[3] = mediumCanoe;
		this.fries[4] = largeCanoe;
		
	}
	
	public void friesPrice(int smallPrice, int mediumPrice, int largePrice, int mediumCPrice, int largeCPrice) {
		
		this.friesPrice[0] = smallPrice;
		this.friesPrice[1] = mediumPrice;
		this.friesPrice[2] = largePrice;
		this.friesPrice[3] = mediumCPrice;
		this.friesPrice[4] = largeCPrice;
		
	}
	
	public void friesMenu() {
		
		System.out.println("");
		System.out.println("Fries Menu:");
		System.out.println(this.fries[0] + ": "+ this.friesPrice[0] + " den");
		System.out.println(this.fries[1] + ": "+ this.friesPrice[1] + " den");
		System.out.println(this.fries[2] + ": "+ this.friesPrice[2] + " den");
		System.out.println(this.fries[3] + ": "+ this.friesPrice[3] + " den");
		System.out.println(this.fries[4] + ": "+ this.friesPrice[4] + "den ");
	}
	

}
