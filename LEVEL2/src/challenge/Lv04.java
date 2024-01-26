package challenge;

import java.util.Scanner;

public class Lv04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();		// x1, y1을 정수로 각각 입력 받음
        int y1 = sc.nextInt();
        if(x1 > 0 && y1 > 0)
            System.out.println(1);	// x 양수, y 양수 -> 1사분면
        else if(x1 > 0 && y1 < 0)
            System.out.println(4);	// x 양수, y 음수 -> 4사분면
        else if(x1 < 0 && y1 > 0)
            System.out.println(2);	// x 음수, y 양수 -> 2사분면
        else
            System.out.println(3);	// x 음수, y 음수 -> 3사분면
	}
}
