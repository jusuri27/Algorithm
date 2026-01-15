import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] t = new int[num+1];
        int[] p = new int[num+1];
        int[] dp = new int[num+2];

        for(int i=1; i<=num; i++) {
            t[i] = sc.nextInt();
            p[i] = sc.nextInt();
        }

        for(int i=num; i>0; i--) {
            int next = i + t[i];

            if(next > num + 1) {
                dp[i] = dp[i+1];
            } else {
                dp[i] = Math.max(dp[i+1], p[i]+dp[next]);
            }
        }

        System.out.println(dp[1]);
    }
}