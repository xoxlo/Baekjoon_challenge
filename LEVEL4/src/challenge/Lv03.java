package challenge;

import java.util.Scanner;

public class Lv03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		int min = arr[0];	// 최소값을 0번 인덱스로 초기화
		int max = arr[0];	// 최대값을 0번 인덱스로 초기화
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max)	// 배열 값이랑 max랑 비교, 비교 숫자가 더크면
				max = arr[i];	// max에 저장
			else if(arr[i] < min)	// 배열 값이랑 min이랑 비교, 비교 숫자가 더 작으면
				min = arr[i];	// min에 저장
		}
		System.out.println(min + " " + max); // 최소값, 최대값 출력
		
	}
}
