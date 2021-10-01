package State_Design_Pattern;

public class Keyboard {

	keyboardState hasPendrive;    
		
	keyboardState noPendrive;
	
	keyboardState isOn;
	
	keyboardState isShutdown;
	
	     
	
	keyboardState KeyboardState;
	
	     
	
	    public Keyboard(){
	
	         
	
	    	hasPendrive = new HasPendrive(this);
	
	    	noPendrive = new NoPendrive(this);
	
	    	isOn = new IsOn(this);
	
	    	isShutdown = new IsShutdown(this);
	
	         
	
	        KeyboardState = isShutdown;
	
	         
	
	    }
	
	     
	
	    void setKeyboardState(keyboardState newKeyboardState){
	
	         
	
	    	KeyboardState = newKeyboardState;
	
	         
	
	    }
	
	     
	
	    public void InsertPendrive() {
	
	         
	
	    	KeyboardState.InsertPendrive();
	
	         
	
	    }
	
	 
	
	    public void EjectPendrive() {
	
	         
	
	    	KeyboardState.EjectPendrive();
	
	         
	
	    }
	
	 
	
	    public void Turnon() {
	
	         
	
	    	KeyboardState.Turnon();
	
	         
	    }
	
	 
	
	    public void Shutdown(){
			         
	    	KeyboardState.Shutdown();
		         
	
	    }
			    
	
	    public keyboardState getYesPendriveState() { return hasPendrive; }
	
	    public keyboardState getNoPendriveState() { return noPendrive; }
	
	    public keyboardState getKeyboardisOnState() { return isOn; }
	
	    public keyboardState getKeyboardShutdownState() { return isShutdown; }
	
}
