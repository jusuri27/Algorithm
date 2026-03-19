import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static char[][] arr;
    static boolean[] visited = new boolean[26];
    static int max = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new char[n][m];

        for(int i=0; i<arr.length; i++) {
            String str = sc.next();
            for(int j=0; j<str.length(); j++) {
                arr[i][j] = str.charAt(j);
            }
        }
        visited[arr[0][0] - 'A'] = true;
        dfs(0, 0, 1);
        System.out.println(max);
    }

    public static void dfs(int cx, int cy, int cnt) {
        max = Math.max(max, cnt);

        for(int i=0; i<dx.length; i++) {
            int nx = cx + dx[i];
            int ny = cy + dy[i];

            if(nx >= 0 && ny >= 0 && nx < arr.length && ny < arr[0].length) {
                int idx = arr[nx][ny] - 'A';
                if(!visited[idx]) {
                    visited[idx] = true;
                    dfs(nx, ny, cnt +1);
                    visited[idx] = false;
                }
            }
        }
    }
}