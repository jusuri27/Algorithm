import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static boolean[] visited = new boolean[26];
    static char[][] arr;
    static int max = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new char[n][m];

        for(int i=0; i<arr.length; i++) {
            String str = br.readLine();
            for(int j=0; j<str.length(); j++) {
                char value = str.charAt(j);
                arr[i][j] = value;
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
                int current = arr[nx][ny] - 'A';
                if(!visited[current]) {
                    visited[current] = true;
                    dfs(nx, ny, cnt + 1);
                    visited[current] = false;
                }
            }
        }
    }
}