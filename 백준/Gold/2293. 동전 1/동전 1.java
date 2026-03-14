import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n+1];
        int[] dp = new int[k+1];
        for(int i=1; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        dp[0] = 1;
        for(int i=1; i<arr.length; i++) {
            for(int j=1; j<dp.length; j++) {
                if(j >= arr[i]) {
                    dp[j] = dp[j] + dp[j - arr[i]];
                }
            }
        }
        System.out.println(dp[k]);
    }
}