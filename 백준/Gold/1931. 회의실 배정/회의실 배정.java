import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] time = new int[n][2];

        for(int i=0; i<n; i++) {
            time[i][0] = sc.nextInt();
            time[i][1] = sc.nextInt();
        }

        Arrays.sort(time, (a, b)-> {
            if(a[1] == b[1]) {
                return a[0] - b[0];
            }
            return a[1] - b[1];
        });

        int cnt = 0;
        int endTime = 0;

        for(int i=0; i<time.length; i++) {
            if(endTime <= time[i][0]) {
                endTime = time[i][1];
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}