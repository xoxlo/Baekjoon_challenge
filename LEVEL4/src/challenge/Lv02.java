package challenge;

import java.util.Scanner;

public class Lv02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cp = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		for(int i = 0; i < arr.length; i++)
			if(arr[i] < cp)
				System.out.print(arr[i]+" ");
	}
}
