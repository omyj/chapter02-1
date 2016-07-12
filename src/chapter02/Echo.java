package chapter02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Echo {
	public static void main(String[] args) {
		try {

			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);

			String str = br.readLine(); // 컴파일러가 readLine()의 예외발성의 가능성이 있다고 판단
			System.out.println(str);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}
