import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];

        for(int i=1; i<dp.length; i++) {
            dp[i] = Integer.MAX_VALUE;
            for(int j=1; j*j<=i; j++) {
                int value = j*j;
                dp[i] = Math.min(dp[i], dp[i-value] + 1);
            }
        }
        System.out.println(dp[n]);
    }
}

/*
0 0
1 1
2 1 1
3 1 1 1
4 2
5 2 1
6 2 1 1
7 2 1 1 1
8 2 2
9 3
 */