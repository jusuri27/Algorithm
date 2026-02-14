import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        int[] dp = new int[n+1];
        for(int i=1; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        dp[1] = arr[1];
        if(n > 1) {
            dp[2] = arr[1] + arr[2];
        }
        for(int i=3; i<dp.length; i++) {
            dp[i] = Math.max(dp[i-1], Math.max(dp[i-2] + arr[i], dp[i-3] + arr[i-1] + arr[i]));
        }
        System.out.println(dp[n]);
    }
}

/*
1 2 3
1 2
1 3
0 2 3

1 2 3 4
1 3 4
1 2 4
2 3

1 2 3 4 5
1 2 4 5
1 3 4
1 3 5
2 3 5

dp[i-3] + arr[i-1] + arr[i]
dp[3]
dp[i-2] + arr[i]

 */
