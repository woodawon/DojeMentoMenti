package day0403;

import java.util.Scanner;

public class SolutionTTT {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String ptrn = "^[1-2]*$"; 
		String select = null;
		String mbti = null;
		String[] question = { 
				"쉬는 시간이 생겼을 때\n(1) 집에 혼자 있는걸 좋아한다.\n(2) 나가서 사람들과 어울리는걸 좋아한다.\n",
				"엘리베이터를 탔을 때\n(1) 엘리베이터는 이동수단일뿐, 빨리 올라가면 좋겠다.\n(2) 사고가 나면 어떻게 탈출을 해야 하지?\n",
				"친구가 차사고가 났다고 연락이 왔을 때\n(1) 보험은 들었어?\n(2) 다친 데는 없어?\n",
				"친구들과 함께 간 여행, 숙소에 도착후 짐을 풀고 나가자! 했을때 어디 갈거냐는 친구의 물음에 당신은?\n(1) 내가 검색해 볼게.\n(2) 일단 나가서 생각해보자!\n"
		};
		String[] ei = {"E", "I"};
		String[] ns = {"N", "S"};
		String[] ft = {"F", "T"};
		String[] pj = {"P", "J"};
		
		select = sc.next();
		if(select.equals("1")) {
			mbti += ei[1];
		} else {
			mbti += ei[0];
		}
		
		select = sc.next();
		if(select.equals("1")) {
			mbti += ei[1];
		} else {
			mbti += ei[0];
		}
		
		select = sc.next();
		if(select.equals("1")) {
			mbti += ei[1];
		} else {
			mbti += ei[0];
		}
		
		select = sc.next();
		if(select.equals("1")) {
			mbti += ei[1];
		} else {
			mbti += ei[0];
		}
		
		System.out.println("당신은" + mbti + "입니다.");
		sc.close();

	}

}
