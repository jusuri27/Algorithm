import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];

        for(int i=1; i<=n; i++) {
            dp[i] = Integer.MAX_VALUE;
            for(int j=1; j*j<=i; j++) {
                dp[i] = Math.min(dp[i], dp[i - (j*j)] + 1);
            }
        }
        System.out.println(dp[n]);
    }
}


/*
dp의 낮은 값 순서대로 최소개수 경우의수를 저장한다
dp[15] = dp[15 - (3*3)] + 1
dp[15] = dp[15 - (2*2)] + 1
dp[15] = dp[15 - (1*1)] + 1
 */