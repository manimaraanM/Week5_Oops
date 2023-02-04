package Week5Assignment;

public class SpacedLogger implements Logger{

	@Override
	public void Log(String slog) {
		String S="";
		for(int i=0;i<slog.length();i++) {
			S += slog.charAt(i) +" ";
		}
		
		System.out.println(S  +'\n');
	}

	@Override
	public void Error(String err) {
		String S="";
		
		for(int i=0;i<err.length();i++) {
			S += err.charAt(i) +" ";
		}
		System.out.println("Error:" +S  +'\n');
	}

}
