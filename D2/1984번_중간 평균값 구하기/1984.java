import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int testCase = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= testCase; tc++) {
			st = new StringTokenizer(br.readLine());
			
			int sum = 0;
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			
			while (st.hasMoreTokens()) {
				int tmp = Integer.parseInt(st.nextToken());
				sum += tmp;
				
				max = Math.max(max, tmp);
				min = Math.min(min, tmp);
			}
			
			sum -= (max + min);
			int res = (int)Math.round(sum / 8.0);
			
			StringBuilder sb = new StringBuilder();
			sb.append("#" + tc + " ")
			  .append(res);
			
			System.out.println(sb.toString());
			
		}
	}
}
