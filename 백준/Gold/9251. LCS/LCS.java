import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int[][] dp = new int[str1.length()+1][str2.length()+1];
        for(int i=1; i<dp.length; i++) {
            for(int j=1; j<dp[i].length; j++) {
                if(str1.charAt(i-1) == str2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        System.out.println(dp[str1.length()][str2.length()]);
    }
}


/*
  A C A Y K P
C 0 1 1 1 1 1
A 1 1 2 2 2 2
P 1 1 2 2 2 3
C 1 2 2 2 2 3
A 2 2 3 3 3 3
K 2 2 3 3 4 4

  A C A
C 0 1 0
A 1 1 2
P 1 1 2
C 1 2 2
A 2 2 3
K 2 2 3
 */