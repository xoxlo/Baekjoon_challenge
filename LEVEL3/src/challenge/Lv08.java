package challenge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Lv08 {
	public static void main(String[] args) throws IOException{	// 예외를 던져줌
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	// BufferedReader 객체 생성
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	// BufferedWriter 객체 생성
		int num = Integer.parseInt(br.readLine());		// 사용자로부터 buffer 스트림으로 입력 받음 라인 기준으로 int형으로 변환해서 num에 저장
		StringTokenizer st;								// 공백으로 분리하기 위해 StringTokenizer 클래스 사용
		for(int i = 1; i <= num; i++) {
			st = new StringTokenizer(br.readLine(), " ");	// StringTokenizer 객체 생성, buffer로부터 라인 기준. 공백 단위로 구분하도록
			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());
			bw.write("Case #" + i + ": " + n1 + " + "+ n2 + " = " + (n1+n2));		// 이쁘게 꾸며주기 Lv06 응용
			bw.newLine();
														// 공백 단위로 구분된 int형을 서로 더해줘서 buffer에다가 저장
		}
		bw.flush();		// 버퍼스트림에 있는 데이터들 다 꺼냄
		bw.close();		// 버퍼 close ! 꼭 해야함
	}
}