package chapter02;

public class MyException extends Exception{
	public MyException() {
		super("개발자가 만든 테스트 예외");
	}
	
	public MyException( String message ){
		super( message );
		
	}
}
