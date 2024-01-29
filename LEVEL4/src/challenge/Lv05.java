package challenge;

import java.util.Scanner;

public class Lv05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	// 바구니 n개 정의
		int m = sc.nextInt();	// 몇번 공을 넣을지 m 정의
		int[] arr = new int[n];
		for(int i = 0; i < m; i++) {
			int j = sc.nextInt();
			int k = sc.nextInt();
			int l = sc.nextInt();
			for(;j <= k ; j++)
				arr[j-1] = l;
		}
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}
}
