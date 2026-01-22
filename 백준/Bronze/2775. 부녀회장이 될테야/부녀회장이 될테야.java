import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int value = 0;
        for(int i=0; i<n; i++) {
            int floor = sc.nextInt();
            int room = sc.nextInt();
            value = count(floor, room);
            System.out.println(value);
        }

    }
    public static int count(int floor, int room) {
        int[][] dp = new int[floor+1][room];
        for(int i=0; i<dp[0].length; i++) {
            dp[0][i] = i+1;
        }
        for(int i=1; i<dp.length; i++) {
            dp[i][0] = 1;
            int sum = 0;
            for(int j=1; j<dp[i].length; j++) {
                dp[i][j] = dp[i][j-1] + dp[i-1][j];
            }
        }
        return dp[floor][room-1];
    }
}

/*

1   4
1   3   6   10  16  22  29  37  46
1   2   3   4   5   6   7   8   9
 */