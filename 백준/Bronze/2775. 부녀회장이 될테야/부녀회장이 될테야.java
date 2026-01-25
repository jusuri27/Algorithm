import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] dp = new int[15][15];
        for(int i=1; i<dp.length; i++) {
            dp[0][i] = i;
            dp[i][1] = 1;
        }

        for(int i=1; i<dp.length; i++) {
            for(int j=2; j<dp.length; j++) {
                dp[i][j] = dp[i][j-1] + dp[i-1][j];
            }
        }

        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++) {
            int floor = Integer.parseInt(br.readLine());
            int room = Integer.parseInt(br.readLine());
            System.out.println(dp[floor][room]);
        }
    }
}
