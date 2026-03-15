import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] dp = new int[n+1][10];
        for(int i=0; i<10; i++) {
            dp[0][i] = 1;
        }

        for(int i=1; i<dp.length; i++) {
            for(int j=0; j<dp[i].length; j++) {
                for(int k=j; k<dp[i].length; k++) {
                    dp[i][j] += dp[i-1][k];
                    dp[i][j] %= 10007;
                }
            }
        }
        System.out.println(dp[n][0]);
    }
}

/*
1   1  1  1  1  1  1  1  1  1 - 10
10  9  8  7  6  5  4  3  2  1 - 45
55  45 36 28 21 15 10 6  3  1 - 165

11 12 13 14 15 16 17 18 19
22 23 24 25 26 27 28 29
...
77 78 79
88 89
99

777 778 779
788 789
799

888 889
899

999
 */