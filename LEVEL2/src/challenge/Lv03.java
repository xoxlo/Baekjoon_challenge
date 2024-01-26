package challenge;

import java.util.*;

public class Lv03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year % 4 == 0 && ( year % 100 != 0 || year % 400 == 0)) // 4의 배수이면서 && ( 100의 배수가 아닐 때 || 400의 배수 ) 조건을 나타내줌
            System.out.println("1");	// 조건에 충족 했을 때 윤년
        else
            System.out.println("0");	// 아닐 시 윤년이 아님
    }
}