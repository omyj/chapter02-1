package chapter02;

import java.io.IOException;

public class ThrowTest {
	public void suspiciousMethod() throws IOException, MyException {
		System.out.println("예외발생 전");
		if (true) {
			throw new MyException("hello my exception");
		}
		System.out.println("예외발생 후");

	}
}
