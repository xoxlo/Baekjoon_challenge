package challenge;

import java.util.Scanner;

public class Lv07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = new char[20]; // 문자 각각을 저장할 배열 공간
		int n = sc.nextInt(); // 몇번 입력 받을 건지 입력
		for(int i = 0; i < n; i++) { // 총 n번 반복
			int num = sc.nextInt(); // 몇번 각 문자를 출력할지 입력
			String word = sc.next(); // 문자열 입력
			for(int j = 0; j < word.length(); j++)
				arr[j] = word.charAt(j); // 각 문자를 배열에 저장함
			for(int k = 0; k < word.length(); k++) { // 문자열의 길이 만큼 반복
				for(int m = 0; m < num; m++) // 각 문자를 num번 반복
					System.out.print(arr[k]); // 출력
			}
			System.out.println(); // 개행
		}
	}
}
