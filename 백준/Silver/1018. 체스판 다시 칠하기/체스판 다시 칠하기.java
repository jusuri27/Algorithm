import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static boolean[][] arr;
    static int min = 64;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new boolean[n][m];

        for(int i=0; i<arr.length; i++) {
            String str = sc.next();
            for(int j=0; j<arr[0].length; j++) {
                char ch = str.charAt(j);
                if(ch == 'W') {
                    arr[i][j] = true;
                }
            }
        }

        int xRange = n - 8;
        int yRange = m - 8;
        for(int i=0; i<=xRange; i++) {
            for(int j=0; j<=yRange; j++) {
                find(i, j);
            }
        }
        System.out.println(min);
    }

    public static void find(int x, int y) {
        int xMax = x+8;
        int yMax = y+8;
        int count = 0;
        boolean check = arr[x][y];

        for(int i=x; i<xMax; i++) {
            for(int j=y; j<yMax; j++) {
                if(check != arr[i][j]) {
                    count++;
                }
                check = !check;
            }
            check = !check;
        }

        count = Math.min(count, 64-count);
        min = Math.min(count, min);
    }
}