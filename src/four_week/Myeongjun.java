package four_week;

public class Myeongjun extends Parents {

	public static void main(String[] args) {

		System.out.println(new Myeongjun().inheritance()); // 오버라이딩 후 출력값 예시
		double d = Parents.result(); // static 접근 제어자 사용 예시
		
		// Cooke 클래스에 있는 메서드 활용 예시
		Cookie cookie = new Cookie();
		String name = "김명준";
		cookie.hello(name);
		cookie.ask();
		String order = cookie.select(1);
		System.out.println(order);
		
		// 메서드 오버로딩 예시
		System.out.println(cookie.plus(5,5));
		System.out.println(cookie.plus(2.5d, 1.3d));
		System.out.println(cookie.plus("안녕","하세요"));
		System.out.println(cookie.plus('a', 'b'));
		
		//메서드 오버라이딩 활용
		new Myeongjun().sayHi(1);
		new Myeongjun().sayHi(3);

	}

	// 메서드 오버라이딩 예시
	@Override
	public String inheritance() {
		String employee = "이민지";
		return employee;
	}
	
	@Override
	void sayHi(int num) {
		if(num == 1) {
			super.sayHi(num);
		} else {
			System.out.println("안녕하세요");
		}
	}
	

}

class Cookie {

	// 메서드 기본 예시
	void hello(String str) {
		System.out.println(str + "님 안녕하세요.");
	}

	void ask() {
		System.out.println("무엇을 주문하시겠습니까?");
	}

	String select(int num) {
		String result = null;
		if (num == 1) {
			result = "coffee";
		} else {
			result = "tea";
		}
		return result;
	}

	// 메서드 오버로딩 예시
	int plus(int a, int b) {
		return a + b;
	}

	double plus(double a, double b) {
		return a + b;
	}

	String plus(String a, String b) {
		return a + b;
	}

	char plus(char a, char b) {
		return 'c';
	}

}