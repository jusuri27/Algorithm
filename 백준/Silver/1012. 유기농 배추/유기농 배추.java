import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            arr = new int[n][m];
            visited = new boolean[n][m];

            for(int j=0; j<k; j++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                arr[a][b] = 1;
            }

            int count = 0;
            for(int p=0; p<arr.length; p++) {
                for(int q=0; q<arr[p].length; q++) {
                    if(!visited[p][q] && arr[p][q] == 1) {
                        count++;
                        bfs(p, q);
                    }
                }
            }
            System.out.println(count);
        }
    }

    public static void bfs(int x, int y) {
        visited[x][y] = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int cx = current[0];
            int cy = current[1];

            for(int i=0; i<dx.length; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if(nx >= 0 && ny >= 0 && nx < arr.length && ny < arr[0].length ) {
                    if(!visited[nx][ny] && arr[nx][ny] == 1) {
                        visited[nx][ny] = true;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }
    }
}