package Adapter;

public class OldCoffeeMachine {
	String result1 = "Option A selected";
	String result2 = "Option B selected";
	
	public String selectA() {
		System.out.println(result1);
		return result1;
		
	}
	public String selectB() {
		System.out.println(result2);
		return result2;
	}

}
