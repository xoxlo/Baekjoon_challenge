package challenge;

import java.util.Scanner;

public class Lv09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length; i++)
			arr[i] = i+1;	// 배열은 0부터 시작. 1부터 넣기 위해 +1

		for(int i = 0; i < m; i++) {	// m개의 줄
			int j = sc.nextInt() - 1; // 배열 0부터 시작으로 -1
			int k = sc.nextInt() - 1;
			
			while(j < k) {	// 역순으로 뒤집음
				int tmp = arr[j];
				arr[j++] = arr[k];	// +1씩 해주면서 인덱스 이동
				arr[k--] = tmp;		// -1씩 해주면서 인덱스 이동
			}
		}

		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
