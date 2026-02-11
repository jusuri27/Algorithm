import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] dp = new int[n+1][2];
        dp[0][0] = 1;
        if(n >= 1) {
            dp[1][1] = 1;
        }

        for(int i=2; i<dp.length; i++) {
            dp[i][0] = dp[i-1][1];
            dp[i][1] = dp[i-1][0] + dp[i-1][1];
        }

        System.out.println(dp[n][0] + " " + dp[n][1]);
    }
}

/*

0 A                                     1 0
1 B                                     0 1
2 BA                                    1 1
3 BAB                                   1 2
4 BABBA                                 2 3
5 BABBABAB                              3 5
6 BABBABABBABBA                         5 8
7 BABBABABBABBABABBABAB                 8 13
8 BABBABABBABBABABBABABBABBABABBABBA    13 21
 */