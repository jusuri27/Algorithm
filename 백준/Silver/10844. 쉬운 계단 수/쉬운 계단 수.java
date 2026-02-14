import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] dp = new int[n+1][10];
        int mod = 1000000000;
        for(int i=1; i<10; i++) {
            dp[1][i] = 1;
        }
        for(int i=2; i<dp.length; i++) {
            for(int j=0; j<dp[i].length; j++) {
                if(j == 0) {
                    dp[i][j] = dp[i-1][j+1] % mod;
                } else if(j == 9) {
                    dp[i][j] = dp[i-1][j-1] % mod;
                } else {
                    dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % mod;
                }
            }
        }
        long sum = 0;
        for(int i=0; i<10; i++) {
            sum += dp[n][i];
        }
        System.out.println(sum % mod);
    }
}

/*
10 12
21 23
32 34
43 45
76 78
87 89
98

101 121 123
210 212 232 234
321 323 343 345
876 878 898
987 989

1010 1012 1210 1212 1232 1234

 */