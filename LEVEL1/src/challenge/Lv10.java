package challenge;

import java.util.Scanner;

public class Lv10 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = num1 * (num2%10);
        int num4 = num1 * ((num2%100)/10);
        int num5 = num1 * (num2/100);
        int result = num3 + 10*num4 + 100*num5;
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(result);
	}
}
