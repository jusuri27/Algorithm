import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int end;
    static int[][] arr;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = sc.nextInt();
        end = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n+1][n+1];
        visited = new boolean[n+1];

        for(int i=0; i<m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            arr[x][y] = 1;
            arr[y][x] = 1;
        }

        dfs(start, 0);
        System.out.println(-1);
    }

    public static void dfs(int start, int depth) {
        visited[start] = true;
        if(start == end) {
            System.out.println(depth);
            System.exit(0);
        }


        for(int i=0; i<arr[0].length; i++) {
            if(arr[start][i] == 1 && !visited[i]) {
                dfs(i, depth + 1);
            }
        }
    }
}