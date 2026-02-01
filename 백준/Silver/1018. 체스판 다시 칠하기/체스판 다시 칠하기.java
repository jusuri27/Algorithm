import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static boolean[][] arr;
    static int answer = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new boolean[n][m];
        for(int i=0; i<arr.length; i++) {
            String line = br.readLine();
            for(int j=0; j<arr[0].length; j++) {
                if(line.charAt(j) == 'W') {
                    arr[i][j] = true;
                }
            }
        }

        int xRange = n - 7;
        int yRange = m - 7;

        find(xRange, yRange);
        System.out.println(answer);
    }

    public static void find(int x, int y) {
        for(int i=0; i<x; i++) {
            for(int j=0; j<y; j++) {
                cal(i, j);
            }
        }
    }

    public static void cal(int x, int y) {
        int xMax = x + 8;
        int yMax = y + 8;
        boolean check = arr[x][y];
        int count = 0;
        for(int i=x; i<xMax; i++) {
            for(int j=y; j<yMax; j++) {
                if(arr[i][j] != check) {
                    count++;
                }
                check = !check;
            }
            check = !check;
        }
        count = Math.min(count, 64 - count);
        answer = Math.min(answer, count);
    }
}