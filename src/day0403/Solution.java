package day0403;

import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * 
 * <개요>
 * 1. 결과 나온것들 마지막에 한번에 출력 -> 네 mbti는 0000다.
 * 2. 잘못된 문자 입력시 멈추거나 질문으로 다시 돌아가기 -> 정규 표현식 사용 -> Pattern.matches(pattern, str);
 * 
 * <After 내용 요약>
 * 1. sysout으로 출력되는 문제들 -> 다 배열에 압축시키기
 * 2. MBTI 알파벳 4개 -> 얘도 배열에 압축시켜서 마지막에 한번에 출력
 * 3. main함수에 있는 코드 전체 -> 반복문으로 압축 -> 소프트코딩 + 가독성 증가
 * 
 */

public class Solution {

    public static void main(String[] args) {

    	// 변수 선언
        Scanner scanner = new Scanner(System.in);
        String pattern = "^[1-2]*$"; // 숫자 1,2만 등장하는지
        
        // 문제 출력
        System.out.println("}**너의 MBTI를 알려줄게**{");
        System.out.print("쉬는 시간이 생겼을 때\n"
                + "(1) 집에 혼자 있는걸 좋아한다.\n"
                + "(2) 나가서 사람들과 어울리는걸 좋아한다.\n");
        
        // 번호 선택 & 결과 출력
        String input = scanner.next();
        if (input.equals("1")) {
            System.out.println("당신은 'I' 입니다.\n");
        } else if (input.equals("2")) {
            System.out.println("당신은 'E' 입니다.\n");
        }    
        
        // 문제 출력
        System.out.print("엘리베이터를 탔을 때\n"
                + "(1) 엘리베이터는 이동수단일뿐, 빨리 올라가면 좋겠다.\n"
                + "(2) 사고가 나면 어떻게 탈출을 해야 하지?\n");
        
        // 번호 선택 & 결과 출력
        input = scanner.next();
        if (input.equals("1")) {
            System.out.println("당신은 'S' 입니다.\n");
        } else if (input.equals("2")) {
            System.out.println("당신은 'N' 입니다.\n");
        }
        
        // 문제 출력
        System.out.print("친구가 차사고가 났다고 연락이 왔을 때\n"
                + "(1) 보험은 들었어?\n"
                + "(2) 다친 데는 없어?\n");
    
        // 번호 선택 & 결과 출력
        input = scanner.next();
        if (input.equals("1")) {
        	System.out.println("당신은 'T' 입니다\n");
        } else if (input.equals("2")) {
        	System.out.println("당신은 'F' 입니다\n");
        }
        
        System.out.print("친구들과 함께 간 여행, 숙소에 도착후 짐을 풀고 나가자! 했을때 어디 갈거냐는 친구의 물음에 당신은?\n"
                + "(1) 내가 검색해 볼게.\n"
                + "(2) 일단 나가서 생각해보자!\n");
        
        input = scanner.next();
        
        if (input.equals("1")) {
            System.out.println("당신은 'J' 입니다\n");
        } else if (input.equals("2")) {
            System.out.println("당신은 'P' 입니다\n");
        }
        
        scanner.close();
        
    }
}