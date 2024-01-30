package challenge;

import java.util.Scanner;

public class Lv05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	// 바구니 n개 정의
		int m = sc.nextInt();	// 몇번 공을 넣을지 m 정의
		int[] arr = new int[n];
		for(int i = 0; i < m; i++) {
			int j = sc.nextInt();	// 시작 바구니
			int k = sc.nextInt();	// 끝 바구니
			int l = sc.nextInt();	// 공을 넣는 번호
			for(;j <= k ; j++)	// 시작 바구니부터 끝 바구니까지 반복
				arr[j-1] = l;	// 배열은 0부터 -1, 바구니에 l숫자 공을 넣는다
		}
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");	// 바구니에 있는 공 출력
	}
}
