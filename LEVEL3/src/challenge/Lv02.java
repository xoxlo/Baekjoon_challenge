package challenge;

import java.util.*;

public class Lv02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();			// 몇개의 숫자를 입력 ?
        for(int i = 0; i < num ; i++){	// 그 숫자 만큼 반복
            int num1 = sc.nextInt();	// 2개의 숫자를 입력 받아서
            int num2 = sc.nextInt();
            System.out.println(num1+num2);	// 2개의 숫자 합을 출력
        }
	}
}