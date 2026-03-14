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

        int max = 0;
        for(int i=0; i<dp.length; i++) {
            dp[i] = 1;
            for(int j=0; j<i; j++) {
                if(arr[i] < arr[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
}


/*
arr[i] < arr[j] 일때

dp[0] = 1
dp[1] = 1
dp[2] = 2
dp[3] = 2
dp[4] = 2
dp[5] = 3 dp[1] + 1 or dp[3] + 1 dp[4] + 1
 */