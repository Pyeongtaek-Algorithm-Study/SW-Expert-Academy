import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("src/Solution/input.txt"));
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		for (int tc = 1; tc <= 10; tc++) {
			int[] arr = new int[100];
			int dump = Integer.parseInt(br.readLine());
			
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 100; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}

			Arrays.sort(arr);
			for (int j = 0; j < dump; j++) {
				arr[0] += 1;
				arr[99] -= 1;
				Arrays.sort(arr);				
			}
			
			int result = arr[99] - arr[0];
			System.out.println("#" + tc + " " + result);
		}
	}

}
