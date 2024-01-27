package challenge;

import java.util.Scanner;

public class Lv10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();	// 별 몇단을 찍을건지 입력
		for(int i = 0; i < num ; i++) {		// 입력한 단수만큼 반복
			for(int j = i ; j < num-1 ; j++) {	// 단수가 늘어날수록 공백은 줄어듦
				System.out.print(" ");
			}
			for(int k = 0; k < i+1; k++) {		// 별을 출력 i(단수)5가 늘어날 때마다 별도 늘어남
				System.out.print("*");
			}
			System.out.println();
		}
	}
}