package challenge;

import java.util.Scanner;

public class Lv07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[31];
		for(int i = 1; i < arr.length; i++) {
			int complete = sc.nextInt();	// 출석번호를 입력 받음
			arr[complete] = 1;	// 입력한 번호는 출석헀다는 표시
		}
		for(int i = 1; i < 31; i++) {
			if(arr[i] != 1)	// 배열에 1이라는 표시가 없는 인덱스는 제출 안한 번호
				System.out.println(i);	// 제출 안한 번호 출력
		}
	}
}
