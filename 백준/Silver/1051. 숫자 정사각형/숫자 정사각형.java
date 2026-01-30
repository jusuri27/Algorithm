import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    static int x;
    static int y;
    static int[][] arr;
    static int answer = 1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        arr = new int[x][y];

        for(int i=0; i<arr.length; i++) {
            String line = br.readLine();
            for(int j=0; j<arr[0].length; j++) {
                arr[i][j] = Character.getNumericValue(line.charAt(j));
            }
        }

        if(x == 1 || y == 1) {
            System.out.println(answer);
            return;
        }
        find(2, 2, 1);
        System.out.println(answer);
    }

    public static void find(int nx, int ny, int count) {
        if(nx > x || ny > y) {
            return;
        }
        for(int i=0; i<=arr.length - nx; i++) {
            for(int j=0; j<=arr[0].length - ny; j++) {
                int a = arr[i][j];
                int b = arr[i][j + count];
                int c = arr[i + count][j];
                int d = arr[i + count][j + count];
                if(a == b && b == c && c == d) {
                    answer = Math.max(answer, nx * ny);
                }
            }
        }
        find(nx + 1, ny + 1, count + 1);
    }
}