package challenge;

import java.util.Scanner;

public class Lv05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	// 입력 받을 갯수 입력
		String str = sc.next();	// 입력 받을 숫자를 문자열로
		int sum = 0;			// 입력한 숫자를 다 더할 sum 정의
		for(int i = 0; i < n; i++) {
			sum += str.charAt(i) - 48;	// 정수는 char형으로 약속된 값으로 저장되어있음 -'0'(48)을 해줘야지 제 값이 나옴
		}								// sum에 더해줌
		System.out.println(sum);	// sum 출력
	}
}
