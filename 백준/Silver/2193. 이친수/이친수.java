import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] dp = new long[n+1];
        dp[1] = 1;
        if(n > 1) {
            dp[2] = 1;
        }

        for(int i=3; i<dp.length; i++) {
            dp[i] = dp[i-2] + dp[i-1];
        }
        System.out.println(dp[n]);
    }
}

/*
1

10

100
101

1000
1001
1010

10000
10001
10010
10100
10101

100000
100001
100010
100100
100101
101000
101001
101010




 */