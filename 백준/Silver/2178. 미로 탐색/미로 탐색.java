import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];
        boolean[][] visited = new boolean[n][m];
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        for(int i=0; i<arr.length; i++) {
            String str = br.readLine();
            for(int j=0; j<str.length(); j++) {
                int value = str.charAt(j) - '0';
                arr[i][j] = value;
            }
        }

        Queue<int[]> queue = new LinkedList<>();
        visited[0][0] = true;
        queue.add(new int[]{0, 0, 1});

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int cx = current[0];
            int cy = current[1];
            int cnt = current[2];

            if(cx == n-1 && cy == m-1) {
                System.out.println(cnt);
                break;
            }

            for(int i=0; i<dx.length; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if(nx >= 0 && ny >= 0) {
                    if(nx < n && ny < m) {
                        if(!visited[nx][ny] && arr[nx][ny] == 1) {
                            visited[nx][ny] = true;
                            queue.add(new int[]{nx, ny, cnt+1});
                        }
                    }
                }
            }
        }
    }
}