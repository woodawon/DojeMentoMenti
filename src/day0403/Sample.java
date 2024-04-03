package day0403;

import java.util.regex.Pattern;

public class Sample {

	public static void main(String[] args) {
		// -- 정규표현식 써보기
		String pattern = "^[1-2]*$"; // 숫자 1,2만 등장하는지
		String str = "1221";

		boolean result = Pattern.matches(pattern, str);
		System.out.println(result); // true
		// --

	}

}
