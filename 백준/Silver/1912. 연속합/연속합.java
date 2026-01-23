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

        int high = arr[0];
        dp[0] = arr[0];
        for(int i=1; i<arr.length; i++) {
            dp[i] = Math.max(dp[i-1] + arr[i], arr[i]);
            high = Math.max(high, dp[i]);
        }
        System.out.println(high);
    }
}