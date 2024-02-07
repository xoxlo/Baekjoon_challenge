package challenge;

import java.util.Scanner;

public class Lv10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine(); // word input
		int count = 0;	// time count
		for(int i = 0; i < word.length(); i++) {
			switch(word.charAt(i)) { // each word, switch
			case 'A' :
			case 'B' :
			case 'C' :
				count += 3;
				break;
			case 'D' :
			case 'E' :
			case 'F' :
				count += 4;
				break;
			case 'G' :
			case 'H' :
			case 'I' :
				count += 5;
				break;
			case 'J' :
			case 'K' :
			case 'L' :
				count += 6;
				break;
			case 'M' :
			case 'N' :
			case 'O' :
				count += 7;
				break;
			case 'P' :
			case 'Q' :
			case 'R' :
			case 'S' :
				count += 8;
				break;
			case 'T' :
			case 'U' :
			case 'V' :
				count += 9;
				break;
			case 'W' :
			case 'X' :
			case 'Y' :
			case 'Z' :
				count += 10;
				break;
				
			}
		}
		System.out.println(count);
	}
}
