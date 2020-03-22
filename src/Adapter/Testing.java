package Adapter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Testing {

	@Test
	public void test1() {
		String selection = "Option A selected";
		OldCoffeeMachine oldCoffee = new OldCoffeeMachine();
		CoffeeTouchScreenAdapter newImproved = new CoffeeTouchScreenAdapter(oldCoffee);
		String result = newImproved.chooseFirstSelection();
		assertEquals(selection, result);
	}
	@Test
	public void test2() {
		String selection = "Option B selected";
		OldCoffeeMachine oldCoffee = new OldCoffeeMachine();
		CoffeeTouchScreenAdapter newImproved = new CoffeeTouchScreenAdapter(oldCoffee);
		String result = newImproved.chooseSecondSelection();
		assertEquals(selection, result);
	}

}
