import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            int[][] arr = new int[n+1][2];
            int[][] dp = new int[n+1][2];
            for(int j=0; j<2; j++) {
                for(int k=1; k<arr.length; k++) {
                    arr[k][j] = sc.nextInt();
                }
            }

            dp[1][0] = arr[1][0];
            dp[1][1] = arr[1][1];

            for(int j=2; j<dp.length; j++) {
                dp[j][0] = Math.max(dp[j-1][1], dp[j-2][1]) + arr[j][0];
                dp[j][1] = Math.max(dp[j-1][0], dp[j-2][0]) + arr[j][1];
            }

            System.out.println(Math.max(dp[n][0], dp[n][1]));
        }
    }
}

/*
dp[j][0] = Math.max(dp[j - 1][1], dp[j - 2][1]) + stickers[j][0];
dp[j][1] = Math.max(dp[j - 1][0], dp[j - 2][0]) + stickers[j][1];


0 50 40  200 140 250
0 30 100 120 210 200

0 50 10 100 20 40
0 30 50 70 10 60



 */