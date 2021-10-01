package State_Design_Pattern;

public class IsShutdown implements keyboardState {

	Keyboard keyboard;

	public IsShutdown(Keyboard newkeyboard) {
		
		keyboard = newkeyboard;
		
	}

	public void Turnon() {
		
		System.out.println("Turn on the System");
		keyboard.setKeyboardState(keyboard.getKeyboardisOnState());

	}

	public void InsertPendrive() {
		
		System.out.println("Your Pendrive has been inserted");
		keyboard.setKeyboardState(keyboard.getYesPendriveState());

	}

	public void EjectPendrive() {
		
		System.out.println("Your Pendrive is ejected");
		keyboard.setKeyboardState(keyboard.getNoPendriveState());


	}
	
	public void Shutdown() {
		
		System.out.println("Shutdown the System");

	}

}
