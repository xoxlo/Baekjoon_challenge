package challenge;

import java.util.Scanner;

public class Lv12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {		// 정수를 입력하지 않으면 false
			int n1 = sc.nextInt();		// n1 입력
			int n2 = sc.nextInt();		// n2 입력
			System.out.println(n1+n2);
		}
	}
}
