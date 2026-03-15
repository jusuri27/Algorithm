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
                if(value <= i) {
                    dp[i] = Math.min(dp[i], dp[i-value] + 1);
                }
            }
        }
        System.out.println(dp[k] == 100000 ? -1 : dp[k]);
    }
}


/*
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
1 2 3 4 1 2 3 4 5 2  3  4  5  6  3
1 2 3 4 1 2 3 4 5 2  3  1  2  3  3


 */