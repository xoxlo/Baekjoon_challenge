package challenge;

import java.util.*;

public class Lv2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if(score >= 90 && score <= 100) // 90점 이상 and 100점 이하 -> A
            System.out.println("A");
        else if(score >= 80)			// 80점 이상 -> B
            System.out.println("B");
        else if(score >= 70)			// 70점 이상 -> C
            System.out.println("C");
        else if(score >= 60)			// 60점 이상 -> D
            System.out.println("D");
        else							// 나머지 -> F
            System.out.println("F");
    }	// 여기서 score >= 80 && score < 90 이렇게 코드 작성을 굳이 안해도 되는 이유는
}		// 어차피 앞에 있는 조건에서 걸러지기 때문에 코드 가독성을 높일 수 있다