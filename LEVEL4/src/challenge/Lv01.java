package challenge;

import java.util.Scanner;

public class Lv01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;			// 입력한 정수가 몇개 있는지 셀 count 정의
		int n = sc.nextInt();	// 몇개를 입력할 지 입력
		int[] arr = new int[n];	// 정수를 담을 n개의 배열 선언
		for(int i = 0; i < arr.length; i++)	// n개의 길이만큼 반복
			arr[i] = sc.nextInt();			// 정수 입력
		int num = sc.nextInt();				// 찾을 num을 입력
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == num)	// 배열에서 num이랑 같으면
				count++;		// count에 +1
		}
		System.out.println(count);
	}
}
