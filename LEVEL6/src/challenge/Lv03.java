package challenge;

import java.io.*;

public class Lv03 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) { 			// 위 피라미드
			for(int j = n-i-1; j > 0; j--) {
				bw.write(" ");				// 피라미드 만들기 위한 공백
			}
			for(int k = 0; k < 2*i+1; k++) { 	// 별 홀수개
				bw.write("*");
			}
			bw.newLine();	// 줄 바꿈
		}
		for(int i = n-1; i > 0; i--) {			// 아래 피라미드
			for(int j = n-i; j > 0; j--) {
				bw.write(" ");				// 피라미드 만들기 위한 공백
			}
			for(int k = 0; k < 2*i-1; k++) {	// 별 홀수개
				bw.write("*");
			}
			bw.newLine();	// 줄 바꿈
		}
		bw.flush();
		bw.close();
	}
}