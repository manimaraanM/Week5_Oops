package Week5Assignment;

public class App {
	public static void main(String[] args) {
		Logger spaced =new SpacedLogger();
		
		Logger asterisk = new AsteriskLogger();
		
		spaced.Log("Spaced Log Test");
		spaced.Error("Spaced Error Test");
		
		asterisk.Log("Asterisk test");
		asterisk.Error("Asterisk Error");
		
		
 		
		
	}

}
