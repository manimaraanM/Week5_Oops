package Week5Assignment;

public class AsteriskLogger implements Logger{


	@Override
	public void Log(String slog) {
		System.out.println("***" +slog +"***" +'\n');
		
	}

	@Override
	public void Error(String err) {
		// TODO Auto-generated method stub
		String S="";
		
		for(int i=0;i<err.length()+13;i++) {
			S+="*";
		}
		System.out.println(S);
		System.out.println("***Error: " +err +"***");
		System.out.println(S  +'\n');
		
	}

}
