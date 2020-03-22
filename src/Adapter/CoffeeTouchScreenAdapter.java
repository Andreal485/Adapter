package Adapter;

public class CoffeeTouchScreenAdapter implements CoffeeMachine {

	private OldCoffeeMachine coffeeMachine;


	public CoffeeTouchScreenAdapter(OldCoffeeMachine oldCoffee) {
		coffeeMachine = oldCoffee;
	}
	
	public String chooseFirstSelection() {
		return coffeeMachine.selectA();
	}
	
	public String chooseSecondSelection() {
		  return coffeeMachine.selectB();
		
}
}
