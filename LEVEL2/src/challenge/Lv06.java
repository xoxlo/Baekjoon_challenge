package challenge;

import java.util.Scanner;

public class Lv06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();	// 시 입력
		int minute = sc.nextInt();	// 분 입력
		int oven = sc.nextInt();	// 오븐 돌릴 시간 입력 (분 단위)
		int tmp;					// 임의의값을 저장할 공간
		
		if((minute+oven)>=60) {		// 분과 오븐의 시간을 더하고 60분 이상일 때
			tmp = (minute+oven)/60; // 분과 오븐을 더해서 60으로 나눈다 -> 왜냐하면 60분에 1시간 이기 때문
									// 60으로 나누면 시간으로 반환
			hour += tmp;			// 그 나눈 시간(tmp)을 hour에 더해줌
			minute = (minute+oven)%60;	// 두개의 시간을 더해서 60으로 나머지를 구함
										// 이 나머지는 말 그대로 남은 분이다
			if(hour >= 24)			// 자정을 고려 (24 이상일 때)
				hour -= 24;			// hour에서 24를 뺴줌
		}else {
			minute += oven;			// minute + oven의 값이 60분을 안넘으면
									// minute에다가 oven 시간만 더함
		}
		System.out.printf("%d %d", hour, minute);
	}
}
