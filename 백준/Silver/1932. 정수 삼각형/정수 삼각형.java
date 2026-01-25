import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Integer[][] dp;
    static int[][] arr;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][n];
        dp = new Integer[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<arr.length; i++) {
            dp[n-1][i] = arr[n-1][i];
        }
        System.out.println(find(0, 0));
    }
    public static int find(int idx, int depth) {
        if(depth == n-1) {
            return dp[depth][idx];
        }
        if(dp[depth][idx] == null) {
            dp[depth][idx] = Math.max(find(idx, depth+1), find(idx+1,depth+1)) + arr[depth][idx];
        }
        return dp[depth][idx];
    }
}
/*
    7
   3 8
  8 1 0
 2 7 4 4
4 5 2 6 5

 */