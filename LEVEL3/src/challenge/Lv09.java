package challenge;

import java.util.Scanner;

public class Lv09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 0; i < num ; i++) {		// num만큼 반복. 단을 의미
			for(int j = 0; j < i+1 ; j++) {	// i가 늘어나는 만큼 별도 늘어남. 별을 단계별로 알맞게 출력하기 위해서 +1
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
