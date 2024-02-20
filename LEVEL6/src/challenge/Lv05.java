package challenge;

import java.util.Scanner;

public class Lv05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[26]; // 알파뱃 총 26개
		String str = sc.next(); // 단어 입력
		for(int i = 0 ; i < str.length(); i++) { // 단어의 길이 만큼 반복
			if('A' <= str.charAt(i) && str.charAt(i) <= 'Z') // 대문자 A-Z
				arr[str.charAt(i) - 'A']++;		// 알파뱃에 맞는 인덱스 값 1증가
			else											// 소문자 a-z
				arr[str.charAt(i) - 'a']++;
		}
		int max = 0;
		char ch = '?';
		
		for( int i = 0; i < 26; i++) {
			if(arr[i] > max) {
				max = arr[i];
				ch = (char)(i+'A'); // 대문자 출력 -> + 'A'
			}
			else if(arr[i] == max)
				ch = '?';
		}
		System.out.println(ch);
	}
}
