package challenge;

import java.util.Scanner;

public class Lv04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int moneyTotal = sc.nextInt();			// 구입한 총 금액
		int productNumTotal = sc.nextInt();		// 구입한 제품 갯수
		int sum = 0;							// 구입한 총 금액과 비교할 sum 정의
		for(int i = 0; i < productNumTotal ; i++) {	// 구입한 물품 갯수 만큼 반복
			int productMoney = sc.nextInt();	// 물품의 금액 입력
			int productNum = sc.nextInt();		// 물품 몇개 샀는지 입력
			sum += (productMoney * productNum);	// 물품 * 갯수 해서 sum에다가 더 함
		}
		if(sum == moneyTotal)			// 구입한 총 금액과 다시 계산한 sum이 같다면
			System.out.println("Yes");	// Yes 출력
		else
			System.out.println("No");	// 다르다면 No 출력
	}
}
