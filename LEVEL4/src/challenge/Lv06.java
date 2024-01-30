package challenge;

import java.util.Scanner;

public class Lv06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++)
			arr[i] = i+1;	// 각 바구니와 같은 번호인 공 저장
		for(int i = 0; i < m; i++) {
			int tmp;	// 임시로 저장할 바구니
			int j = sc.nextInt();	// 바꿀 바구니 입력
			int k = sc.nextInt();	// 바꿀 바구니 입력
			tmp = arr[j-1];			// 서로 교환함
			arr[j-1] = arr[k-1];
			arr[k-1] = tmp;
		}
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}
}
