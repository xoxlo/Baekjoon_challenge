package challenge;

import java.util.Scanner;

public class Lv07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();				// 주사위1 입력
		int n2 = sc.nextInt();				// 주사위2 입력
		int n3 = sc.nextInt();				// 주사위3 입력
		
		// 주사위의 숫자가 3개가 모두 같을 때
		if(n1 == n2 && n2 == n3) {			
			System.out.println(n1*1000 + 10000);
			
		// 주사위의 숫자가 2개가 같을 때
		}else if(n1 == n3) {
			System.out.println(n1*100 + 1000);
		}else if(n2 == n3) {
			System.out.println(n2*100 + 1000);
		}else if(n1 == n2) {
			System.out.println(n1*100 + 1000);
		}else {
			
		// 주사위의 숫자가 모두 다를 때
			if((n1 < n2) && (n2 < n3)) {
				System.out.println(n3*100);
			}else if((n1 < n2) && (n2 > n3)) {
				System.out.println(n2*100);
			}else if((n1 > n2) && (n1 > n3)){
				System.out.println(n1*100);
			}else if((n1 > n2) && (n1 < n3)) {
				System.out.println(n3*100);
			}
		}
	}
}
