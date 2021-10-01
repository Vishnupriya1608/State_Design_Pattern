package State_Design_Pattern;

public class TestKeyboard {

	public static void main(String[] args) {
		
		Keyboard keyboard = new Keyboard();
		
		keyboard.Turnon();
		
		keyboard.InsertPendrive();
		
		keyboard.EjectPendrive();
		
		keyboard.Shutdown();

	}

}
