package challenge;

import java.util.Scanner;

public class Lv05{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();	// 시간을 입력
        int minute = sc.nextInt();	// 분을 입력
        int tmp;					// 임시로 분을 저장할 공간 선언
        
        if((minute-45) < 0){		// 45분을 뺐을때 음수가 나올 경우 ? -> 시간도 빼줘야함
            tmp = minute-45;		// 임시공간에 음수 그대로 저장
            minute = tmp+60;		// 임의의값 + 60을 했을 때 알맞는 분이 나옴
            
            						// 그 다음 시간 변경 차례
            if(hour == 0)			// 자정일 때를 생각 
                hour = 23;
            else					// 자정이 아닐 경우는 1시간만 빼줌
                hour--;
        } else{
            minute = minute-45;		// 음수가 아닐 경우는 그냥 그대로 minute만 수정 후 출력
        }
        System.out.printf("%d %d", hour, minute);
    }
}