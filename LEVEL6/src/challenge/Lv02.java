package challenge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Lv02 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] chess = {1, 1, 2, 2, 2, 8}; // 체스의 기본 구성 피스 (킹, 퀸, 룩, 비숍, 나이트, 폰)
		int[] num = new int[6]; // 발견한 피스 입력하는 배열
		
		StringTokenizer st = new StringTokenizer(br.readLine()); // 입력받은 문자열을 Token으로 분리 (공백으로 구분)
		for(int i = 0; i < num.length; i++)
			num[i] = Integer.parseInt(st.nextToken()); // 구분한 Token을 int형으로 변환 후 배열에 저장
		for(int i = 0; i < num.length; i++) {
			if(chess[i] > num[i])	// 발견한 체스의 피스가 더 적을 때
				bw.write(String.valueOf(chess[i] - num[i] + " ")); // 부족한 갯수 출력
			else					// 발견한 체스의 피스가 더 많을 때
				bw.write(String.valueOf(chess[i] - num[i] + " ")); // 빼야되는 갯수 출력
		}
		bw.flush();	// 버퍼에 있는 값, 전체 출력 및 비움
		bw.close();
	}
}
