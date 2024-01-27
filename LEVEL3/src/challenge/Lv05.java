package challenge;

import java.util.Scanner;

public class Lv05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();		// byte 입력
		for(int i = 0 ; i < num/4 ; i++)	// byte를 4 나눠서 나온 값 만큼 반복
			System.out.print("long ");		// long 출력
		System.out.println("int");			// 마지막 int 붙여서 출력
	}
}
