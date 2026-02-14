import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] dp = new int[n+1][2];
        dp[1][1] = 1;
        if(n > 1) {
            dp[2][0] = 1;
            dp[2][1] = 1;
        }

        for(int i=2; i<dp.length; i++) {
            dp[i][0] = dp[i-1][1];
            dp[i][1] = dp[i-1][0] + dp[i-1][1];
        }
        System.out.println(dp[n][0] + " " + dp[n][1]);
    }
}

/*
0
A

1
B

2
BA

3
BAB

4
BABBA

5
BABBABAB
 */