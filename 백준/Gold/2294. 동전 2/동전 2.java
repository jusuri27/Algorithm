import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int[] dp = new int[k+1];

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=1; i<dp.length; i++) {
            dp[i] = 100000;
            for(int j=0; j<arr.length; j++) {
                int value = arr[j];
                if(i >= value) {
                    dp[i] = Math.min(dp[i], dp[i-value] + 1);
                }
            }
        }

        System.out.println(dp[k] == 100000 ? -1 : dp[k]);
    }
}

/*

dp[0] = 0;
dp[2] = dp[2-1] + 1
dp[5] = dp[5-5] + 1 or dp[5-1] + 1

 */