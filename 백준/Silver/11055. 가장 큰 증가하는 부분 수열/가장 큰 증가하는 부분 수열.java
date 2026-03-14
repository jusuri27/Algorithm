import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] dp = new int[n];

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        dp[0] = arr[0];
        int max = 0;
        for(int i=0; i<dp.length; i++) {
            dp[i] = arr[i];
            for(int j=0; j<=i; j++) {
                if(arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + arr[i]);
                }
            }
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
}

/*
1 100 2 50 60
dp[1] = 1;
dp[2] = 101;
dp[3] = 3;
dp[4] = 53;
dp[5] = 113;

 */