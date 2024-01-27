package challenge;

import java.util.Scanner;

public class Lv03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();	// num 입력
		int sum = 0;			// 1부터 n까지의 합을 담을 sum 정의
		while(num>0) {			// num이 0이상일 때 반복
			sum+=num;			// num을 담으면서
			num--;				// -1씩 해줌
		}
		System.out.println(sum);	// 총 합 출력
	}
}
