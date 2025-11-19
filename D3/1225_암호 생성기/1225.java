import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Solution {
	private static Queue<Integer> q;
	
	public static void main(String[] args) throws IOException {
//		System.setIn(new FileInputStream("src/input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		
		for (int tc = 1; tc <= 10; tc++) {
			br.readLine();
			q = new LinkedList<>();
			
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				q.add(Integer.parseInt(st.nextToken()));
			}

			int sub = 1;	
			while (q.peek() - sub > 0) {							
				q.add(q.poll() - sub);
				sub = ++sub > 5 ? 1 : sub;
			}
			
			q.poll();
			q.add(0);

			StringBuilder sb = new StringBuilder();
			sb.append("#" + tc + " ");
			while (!q.isEmpty()) {
				sb.append(q.poll() + " ");
			}
			
			System.out.println(sb.toString());
		}
	}
}
