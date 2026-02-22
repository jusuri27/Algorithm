import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        visited = new boolean[n][n];

        for(int i=0; i<arr.length; i++) {
            String str = br.readLine();
            for(int j=0; j<arr[i].length; j++) {
                arr[i][j] = str.charAt(j) - '0';
            }
        }

        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                if(!visited[i][j] && arr[i][j] == 1) {
                    count++;
                    list.add(bfs(i, j));
                }
            }
        }
        System.out.println(count);
        Collections.sort(list);
        for(int i : list) {
            System.out.println(i);
        }
    }

    public static int bfs(int x, int y) {
        visited[x][y] = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});

        int cnt = 1;
        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int cx = current[0];
            int cy = current[1];

            for(int i=0; i<dx.length; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if(nx >= 0 && ny >= 0 && nx < arr.length && ny < arr[0].length) {
                    if(!visited[nx][ny] && arr[nx][ny] == 1) {
                        visited[nx][ny] = true;
                        cnt++;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }

        return cnt;
    }
}