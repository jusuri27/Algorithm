import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            int[][] arr = new int[2][n+1];
            int[][] dp = new int[2][n+1];

            for(int j=0; j<arr.length; j++) {
                for(int k=1; k<arr[j].length; k++) {
                    arr[j][k] = sc.nextInt();
                }
            }

            dp[0][1] = arr[0][1];
            dp[1][1] = arr[1][1];

            for(int k=2; k<=n; k++) {
                dp[0][k] = Math.max(dp[1][k-1], dp[1][k-2]) + arr[0][k];
                dp[1][k] = Math.max(dp[0][k-1], dp[0][k-2]) + arr[1][k];
            }

            System.out.println(Math.max(dp[0][n], dp[1][n]));
        }
    }
}