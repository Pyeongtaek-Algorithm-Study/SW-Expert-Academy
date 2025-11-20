import java.io.FileInputStream;
import java.io.*;
import java.util.*;

public class Solution {
	static final int size = 101;
	static int[][] arr;
	static int res;
	
	public static void main(String[] args) throws IOException {
//		System.setIn(new FileInputStream("src/input.txt"));
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		for (int tc = 1; tc <= 10; tc++) {
			st = new StringTokenizer(br.readLine());
			st.nextToken();
			int cnt = Integer.parseInt(st.nextToken());
			
			arr = new int[2][size];
			res = 0;
			
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < cnt; i++) {
				int idx = Integer.parseInt(st.nextToken());
				int val = Integer.parseInt(st.nextToken());
				
				if (arr[0][idx] != 0) {
					arr[1][idx] = val;
				}
				else {
					arr[0][idx] = val;
				}
			}
			
			solve(arr[0][0]);
			solve(arr[0][1]);
			
			StringBuilder sb = new StringBuilder();
			sb.append("#" + tc + " ")
				.append(res);
			System.out.println(sb.toString());
			
		}
		
	}
	
	private static void solve(int st) {
		if (st == 0) {
			return;
		}
		else if (st == 99) {
			res = 1;
		}
		
		solve(arr[0][st]);
		solve(arr[1][st]);
	}
	
}
