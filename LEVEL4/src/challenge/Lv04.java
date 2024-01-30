package challenge;

import java.util.Scanner;

public class Lv04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];	// 9개 정수를 가지는 배열
		int max = 0;	// 최대값 저장 변수
		int n = 0;	// 최대값이 몇번째 인덱스에 있는지 저장 변수
		for(int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {	// max보다 배열의 값이 더 크면
				max = arr[i];	// max값 초기화
				n = i+1;	// 배열 0부터 시작이니까 +1
			}
		}
		System.out.println(max); // max값 출력
		System.out.println(n);	// 몇번째에 있는지 출력
	}
}
