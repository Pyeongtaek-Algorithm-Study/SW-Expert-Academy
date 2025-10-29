import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int n = sc.nextInt();
            int[][] paskal = new int[n + 1][n + 1];
            
            for (int i = 0; i < n; i++) {
				for (int j = 0; j <= i; j++) {
                 	if (j == 0) {
                    	paskal[i][j] = 1;
                    }
                    else if (i == j) {
                     	paskal[i][j] = 1;   
                    }
                    else {
                        paskal[i][j] = paskal[i - 1][j] + paskal[i - 1][j - 1];   
                    }
                }
            }
            
            System.out.println("#" + test_case);
            for (int i = 0; i < n; i++) {
             	for (int j = 0; j <= i; j++) {
                	System.out.print(paskal[i][j] + " ");      
                }
                System.out.println();
            }
		}
	}
}
