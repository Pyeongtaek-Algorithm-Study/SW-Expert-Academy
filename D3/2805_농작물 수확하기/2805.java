import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= tc; t++) {
			int n = Integer.parseInt(br.readLine());
			
			int[][] ground = new int[n + 1][n + 1];

			for (int i = 0; i < n; i++) {			
				String str = br.readLine();
				for (int j = 0; j < n; j++) {
					ground[i][j] = str.charAt(j) - '0';
				}
			}
			
			int sum = 0;
			int range = 1;
			
			for (int i = 0; i < n / 2; i++) {
				int p = n / 2 - i;
				
				// 위아래에 위치한 합
				for (int j = 0; j < range; j++) {
					sum += ground[i][p + j];
					sum += ground[n - i - 1][p + j];
				}
				
				range += 2;
			}
			
			// 가장 가운데 위치한 행 합
			for (int i = 0; i < n; i++) {
				sum += ground[n / 2][i];
			}
			
			StringBuilder sb = new StringBuilder();
			sb.append("#")
				.append(t)
				.append(" ")
				.append(sum);
			
			System.out.println(sb.toString());
		}
	}
}
