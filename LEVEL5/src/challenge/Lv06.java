package challenge;

import java.util.Scanner;

public class Lv06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[26];
		for(int i = 0; i < arr.length; i++) // 모든 배열을 -1로 초기화
			arr[i] = -1;
		String word = sc.nextLine(); // 단어를 입력 받음
		for(int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);	// 하나하나 문자를 비교 ch 선언 및 초기화
			if(arr[ch - 'a'] == -1) // arr 원소 값이 -1인 경우에만 초기화, 동일한 문자가 포함되어있는 경우
				arr[ch - 'a'] = i; // 배열에 입력한 문자의 위치를 저장함
		}
		for(int val : arr)
			System.out.print(val + " "); // 출력
	}
}
