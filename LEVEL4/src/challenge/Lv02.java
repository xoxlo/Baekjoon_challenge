package challenge;

import java.util.Scanner;

public class Lv02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cp = sc.nextInt();	// 비교할 숫자를 입력
		int[] arr = new int[n];	// 사이즈가 n인 정수형 배열 생성
		for(int i = 0; i < arr.length; i++) // 정수 n개 입력
			arr[i] = sc.nextInt();
		for(int i = 0; i < arr.length; i++)
			if(arr[i] < cp)	// 배열에 있는 정수가 더 작으면 출력
				System.out.print(arr[i]+" ");
	}
}
