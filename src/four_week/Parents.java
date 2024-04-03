package four_week;

public class Parents {
	
	// public 접근 제어자 : 다 가능.
	public String inheritance() {
		String employee = "김민수";
		return employee;
	}
	
	// private 접근 제어자 : Parents 클래스 자기 자신 외의 다른 어느 곳에서도 사용 불가능.
	private static int only() {
		return 10;
	}
	
	// static 접근 제어자 : 클래스 이름을 명시한 후 이름.메서드() 의 형식으로 사용하라는 의미의 제어자.
	static double result() {
		return 2.5d;
	}
	
	void sayHi(int num) {
		System.out.println(num + "hello");
	}
	
}
