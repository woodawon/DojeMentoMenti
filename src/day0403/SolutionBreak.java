package day0403;

import java.util.Scanner;

public class SolutionBreak {

	public static void main(String[] args) {
		
		// 변수 선언
		Scanner sc = new Scanner(System.in);
		String ptrn = "^[1-2]*$"; // 숫자 1,2만 등장하는지
		String[] question = { // 질문
				
				"쉬는 시간이 생겼을 때\n"
		      + "(1) 집에 혼자 있는걸 좋아한다.\n"
		      + "(2) 나가서 사람들과 어울리는걸 좋아한다.\n",
		        "엘리베이터를 탔을 때\n"
		      + "(1) 엘리베이터는 이동수단일뿐, 빨리 올라가면 좋겠다.\n"
		      + "(2) 사고가 나면 어떻게 탈출을 해야 하지?\n",
		        "친구가 차사고가 났다고 연락이 왔을 때\n"
		      + "(1) 보험은 들었어?\n"
		      + "(2) 다친 데는 없어?\n",
		        "친구들과 함께 간 여행, 숙소에 도착후 짐을 풀고 나가자! 했을때 어디 갈거냐는 친구의 물음에 당신은?\n"
		      + "(1) 내가 검색해 볼게.\n"
		      + "(2) 일단 나가서 생각해보자!\n"
				
		};
		
		String[] alpa = {"E", "I", "N", "S", "F", "T", "P", "J"};
		   				//0    1    2    3    4    5    6    7
		String mbti = ""; // mbti 검사 결과물
		String num = null; // 기매영 = 김혜영 = 기매 = 도제1짱
		int count = 1; 
		
		for(int i = 0; i < question.length; i++) {
			System.out.println(question[i]); // 질문 출력
			num = sc.next();
			if(num.equals("1")) {
				mbti += alpa[count]; // alpa 배열의 홀수 번째 값들
			} else if(num.equals("2")) {
				mbti += alpa[count-1]; // alpa 배열의 짝수 번째 값들
			} else {
				System.out.println("숫자 1 또는 2만 입력 가능합니다.");
				break; // 1만큼만 감소시켜라(= -1)
			}
			count += 2;
		}
		
		if(mbti != "") {
			System.out.println("당신은 " + mbti + " 입니다.");
		}
		
		sc.close();
	}

}
