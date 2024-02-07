package challenge;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Lv08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine(); // 문자열 입력
		StringTokenizer wd = new StringTokenizer(word, " "); // 공백으로 문자열을 분리
		System.out.println(wd.countTokens()); // 토큰의 수를 int형으로 반환
	}
}

// StringTokenizer 라는 클래스를 이용
// 이 클래스는 문자열을 우리가 지정한 구분자로 문자열을 각각 토큰으로 쪼개 주는 클래스