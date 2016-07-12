package chapter02;

import java.io.IOException;

public class ThrowTestApp {
	public static void main(String[] args) {
		ThrowTest throwTest = new ThrowTest();
		try {
			throwTest.suspiciousMethod();
		} catch (MyException e) {
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}
		
		
		try {
			test();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void test() throws IOException, MyException{  //메소드에서 예외를 처리하지않고 test()를 사용한 곳에서 처리하도록 회피
		ThrowTest throwTest = new ThrowTest();
		throwTest.suspiciousMethod();
	}
}
