package Solution;

import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("src/Solution/input.txt"));
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		for (int tc = 1; tc <= 10; tc++) {
			int[][] board = new int[101][101];
			int result = -1;
			
			int c = Integer.parseInt(br.readLine());
			
			// board에 값 입력			
			for (int i = 1; i <= 100; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 1; j <= 100; j++) {
					board[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			int leftToSum = 0;
			int rightToSum = 0;
			
			for (int i = 1; i <= 100; i++) {
				int rowToSum = 0;
				int colToSum = 0;
				for (int j = 1; j <= 100; j++) {
					rowToSum += board[i][j];
					colToSum += board[j][i];
				}
				// 각 행과 열 최댓값 비교
				result = Math.max(result, rowToSum);
				result = Math.max(result, colToSum);
				
				// 대각선 합계 구하기
				leftToSum += board[i][i];
				rightToSum += board[i][101 - i];
			}
			
			result = Math.max(result, leftToSum);
			result = Math.max(result, rightToSum);
			
			StringBuilder sb = new StringBuilder();
			sb.append("#")
			  .append(tc)
			  .append(" ")
			  .append(result);
			
			System.out.println(sb.toString());
		}
	}
}
