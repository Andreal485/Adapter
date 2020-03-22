package Adapter;

public class Main {
	public static void main(String[] args) {
		OldCoffeeMachine oldCoffee = new OldCoffeeMachine();
		CoffeeTouchScreenAdapter newImproved = new CoffeeTouchScreenAdapter(oldCoffee);
		newImproved.chooseFirstSelection();
		newImproved.chooseSecondSelection();
		
		
		
	}

}
