package challenge;

import java.util.Scanner;

public class Lv11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())	// 입력이 있을 때까지만 반복. 입력이 없으면 false 반환
			System.out.println(sc.nextLine());
	}
}
