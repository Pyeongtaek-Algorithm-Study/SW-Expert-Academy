import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T;
		T= Integer.parseInt(br.readLine());

		for(int test_case = 1; test_case <= T; test_case++)
		{
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    
		    int n = Integer.parseInt(st.nextToken());
		    int m = Integer.parseInt(st.nextToken());
		    int[][] arr = new int[n + 1][n + 1];
		    int ans = Integer.MIN_VALUE;
		    
		    for (int i = 1; i <= n; i++) {
		        st = new StringTokenizer(br.readLine());
		        for (int j = 1; j <= n; j++) {
		            // 누적합 
		            arr[i][j] = Integer.parseInt(st.nextToken()) + arr[i - 1][j] + arr[i][j - 1] - arr[i - 1][j - 1];
		          
		            if (i >= m && j >= m) {
		                ans = Math.max(ans, arr[i][j] - arr[i - m][j] - arr[i][j - m] + arr[i - m][j - m] );
		            }
		        }
		    }
		    
		    System.out.println("#" + test_case + " " + ans);
		}
	}
}
