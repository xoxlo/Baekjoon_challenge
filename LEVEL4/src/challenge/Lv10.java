package challenge;

import java.util.Scanner;

public class Lv10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] arr = new double[n];	// 점수가 들어갈 배열
		double max = 0, sum = 0;	// max와 sum 생성 및 초기화
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();	// 배열에 점수를 넣으면서
			if(arr[i] > max)		// max보다 크면
				max = arr[i];		// 초기화
		}
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr[i]/max*100;	// 점수/최대점수*100으로 재입력
			sum += arr[i];	// 합
		}
		System.out.println(sum/n);	// 평균 출력
	}
}
