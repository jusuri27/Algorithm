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

        for(int i=0; i<dp.length; i++) {
            dp[i] = 1;

            for(int j=0; j<i; j++) {
                if(arr[j] < arr[i] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
        }
        int max = 0;
        for(int i=0; i<dp.length; i++) {
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
}