package challenge;

import java.util.Scanner;

public class Lv11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n1 = sc.nextInt();		// n1 입력
			int n2 = sc.nextInt();		// n2 입력
			if(n1 != 0 && n1 != 0)		// n1과 n2가 0이 아니라면
				System.out.println(n1+n2);	// 덧셈 출력
			else
				break;					// 둘 다 0이라면 반복문 탈출
		}
	}
}
