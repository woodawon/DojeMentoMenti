package four_week;

public class Myeongjun_Comment { // 4. Parents 클래스를 상속 받아보세요. (extends 사용)
	// ex - 부모 클래스 : Parents , 자식 클래스 : 지금 이 클래스.
	
	// *********** 1,2,3.. 등 구현 순서대로 작성하세요. **********

	public static void main(String[] args) {
		
		// 5. 테스트 해보기
		// **메서드 오버라이딩** -> new 클래스 명.inheritance(); 입력해서 출력해보세요. 김민수입니까 이민지입니까?
		// static 접근 제어자를 사용해보세요. double d = 상속받은 클래스 이름.result();
		// Cookie 클래스를 인스턴스화 하세요. (클래스 객체 선언)
		// String name = "김명준"; 선언하세요.
		// 인스턴스화한 cookie클래스 객체의 객체명(= 변수명).hello(name); 을 입력하여 cookie클래스의 hello메서드를 호출하세요.
		// 방금 말한 것과 같은 원리로 cookie클래스 객체명.ask();를 해보세요.
		// String order = cookie클래스 객체명.select(1); 을 입력하세요.
		// order변수의 값을 출력하세요.
		// **이제 메서드 오버로딩 테스트해보겠음**
		// cookie클래스 객체명.plus(?,?);을 sysout에 넣어서 출력시키세요. 근데 총 4번 선언하셔야 하고, 파라미터로 int, double, String, char를 각각 한번씩 다 넣어서 모두 출력시키세요.
		// **메서드 오버라이딩** -> new 지금 이 클래스 이름().sayHi(1); 하고 new 지금 이 클래스 이름().sayHi(3); 도 해보세요.
		// 1 ~ 5번까지 잘 왔다면 끝. 수고하셨습니다.
		
	}
	// 3. ***메서드 오버라이딩***
	// <메서드 선언> 어노테이션 : @Override / 접근 제어자 : public / 자료형 : String / 메서드 이름 : inheritance()
	// -> 값 : String employee : 이민지 / return값 : employee
	// <메서드 선언> 어노테이션 : @Override / 접근 제어자 : 없음 / 자료형 : void / 메서드 이름 : sayHi(파라미터 : int num)
	// -> 값 : 만약 파라미터 num이 1이라면 super.sayHi(num);을 하고, 아니라면 안녕하세요 출력. 
	
}

// 1. Cookie 클래스 선언 : 이 파일 안에 선언하기.
// -> 안의 값 : 메서드 hello, ask, select, plus(여러 개)
// <메서드 선언> 접근 제어자 : 없음 / 자료형 : void / 파라미터 : String str
// -> 값 : str + "님 안녕하세요." 출력
// <메서드 선언> 접근 제어자 : 없음 / 자료형 : void 
// -> 값 : 무엇을 주문하시겠습니까? 출력
// <메서드 선언> 접근 제어자 : 없음 / 자료형 : String / 파라미터 : int num
// -> 값 : String result 변수 /  만약 num이 1이면 result는 coffee고, 아니면 result는 tea임.
// -> return result;
// <메서드 선언> ***메서드 오버로딩*** 해보기! -> plus 메서드로.
// -> plus 메서드를 int형, double, String, char로 선언하세요.
// 각 메서드는 메서드와 같은 자료형을 가지는 파라미터 두 개를 받으세요.
// 그리고 return으로는 두 변수를 더한 값을 리턴시키세요. 
// ** char형 plus함수는 return 'c';로 하세요.

// 2. Parents 클래스 만들기
// -> 이번엔 이 파일에 만들지 마시고, 이 클래스와 같은 패키지 안에 파일을 새로 생성하세요.
// -> 안의 내용 : 메서드 4개. 
// <메서드 선언> 접근 제어자 : public / 자료형 : String / 이름 : inheritance()
// -> 값 : String employee = 김민수 / return값 : employee
// <메서드 선언> 접근 제어자 : private static / 자료형 : int / 이름 : only()
// -> 값 : return 10;
// <메서드 선언> 접근 제어자 : static / 자료형 : double / 이름 : result()
// -> 값 : return 2.5d;
// <메서드 선언> 접근 제어자 : 없음 / 자료형 : void / 파라미터 : int num 
// -> 값 : num + "hello" 출력





