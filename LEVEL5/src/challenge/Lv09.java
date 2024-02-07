package challenge;

import java.util.Scanner;

public class Lv09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int cmp1 = (n1 % 10)*100 + ((n1 / 10) % 10 )*10 + (n1 / 100); // 백의 자리 + 십의 자리 + 일의 자리
		int cmp2 = (n2 % 10)*100 + ((n2 / 10) % 10 )*10 + (n2 / 100); // 나누기와 나머지를 이용해서 반대로 돌려줌
		if(cmp1 > cmp2)
			System.out.println(cmp1);
		else
			System.out.println(cmp2);
			
	}
}
