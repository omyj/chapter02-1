package chapter02;

public class ArrayException {
	public static void main(String[] args) {
		try {
			int[] intArray = new int[5];
			intArray[0] = 0;
		
			for (int i = 0; i < 5; i++) {
				intArray[i + 1] = i + 1 + intArray[i];
				System.out.println("intArray[" + i + "]" + "=" + intArray[i]);
			}
		} catch (Exception ex) { //catch문 안에는 항상 예외처리결과를 출력해야한다.
			System.out.println(ex);
			System.out.println("죄송합니다. 비정상 상황이 되어 프로그램을 종료합니다.");
			return;
		} finally {
			System.out.println("자원정리!!");
		}
	}

}
