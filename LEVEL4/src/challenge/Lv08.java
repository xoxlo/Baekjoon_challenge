package challenge;

import java.util.Scanner;

public class Lv08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean check;	// 중복 체크
		int count = 0;	// 서로 다른 나머지 count
		int[] arr = new int[10];	// 
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt() % 42;	// 입력한 숫자에다가 42로 나눈 나머지를 저장 
		}
		for(int i = 0; i < arr.length; i++) {	// 배열 1개씩 비교
			check = false;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {	// i번째 배열과 j번째 배열 비교, 같다면 중복
					check = true;	// 중복 true
					break;			// 반복문 탈출, 더 이상 비교할 필요 없음
				}
			}
			if(check == false)	// 중복이 아니라면
				count++;		// +1씩
		}
		System.out.println(count);	// 서로 다른 나머지 갯수 출력
	}
}	