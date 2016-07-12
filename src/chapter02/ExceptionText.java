package chapter02;

public class ExceptionText {
	public static void main(String[] args) {
		int a = 0;
		double d = 0.;
		// 의심되는 코드 부분에 try catch구문 사용
		try {
			d = 10 / a;
			System.out.println(d);
		} catch (ArithmeticException ex) {
			System.out.println("error:" + ex);
			// TODO: handle exception

			// 1. logging(파일 혹은 DB에 저장)
			// 2. 자원정리
			// 3. 사용자에게 메세지
			System.out.println("죄송합니다. 비정상 상황이 되어 프로그램을 종료합니다.");
			// 4. 정상종료
			return;
		} finally{
			System.out.println("자원정리!!");
		}
	}
}
