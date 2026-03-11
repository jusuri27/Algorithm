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
                for(int k=j; k<10; k++) {
                    dp[i][j] += dp[i-1][k];
                    dp[i][j] %= 10007;
                }
            }
        }

        System.out.println(dp[n][0] % 10007);
    }
}

/*

11 12 13 14 15 16 17 18 19
22 23 24 25 26 27 28 29
33 34 35 36 37 38 39
...
77 78 79
88 89
99

111 112 113 114 115 116 117 118 119
188 189
199

222 223

777 778 779
788 789
799

888 889
899

999

 */