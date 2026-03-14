import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n+1][n+1];
        int[][] dp = new int[n+1][n+1];


        for(int i=1; i<dp.length; i++) {
            for(int j=1; j<dp[i].length; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1] + sc.nextInt() - dp[i-1][j-1];
            }
        }

        for(int i=0; i<m; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            int value = dp[x2][y2] - dp[x1-1][y2] - dp[x2][y1-1] + dp[x1-1][y1-1];
            System.out.println(value);
        }
    }
}

/*
dp 모든 구간 합계 구하는 부분
dp[i-1][j] + dp[i][j-1] + arr[i][j] + dp[i-1][j-1];

범위값 구하는법
전체 - 가로 - 세로 + 겹치는 부분
dp[x2][y2] - dp[x1-1][y2] - dp[x2][y1-1] + dp[x1-1][y1-1]

1 2 3 4
2 3x 4 5
3 4 5 6
4 5 6 7

 */