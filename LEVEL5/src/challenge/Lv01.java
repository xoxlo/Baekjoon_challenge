package challenge;

import java.util.*;

public class Lv01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();	// 문자열 입력
        int n = sc.nextInt();	// 몇번째 문자 출력할건지 입력
        System.out.println(str.charAt(n-1));	// 0번째부터 시작하니까 -1
    }
}