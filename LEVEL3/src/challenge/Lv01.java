package challenge;

import java.util.*;

public class Lv01{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dan = sc.nextInt();					// 출력할 dan 입력
        for(int i = 1; i <= 9 ; i++)			// 1~9까지 반복
            System.out.printf("%d * %d = %d\n",dan, i, dan*i);	// dan 출력
    }
}