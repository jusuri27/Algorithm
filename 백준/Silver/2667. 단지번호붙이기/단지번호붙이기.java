import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int[][] arr;
    static boolean[][] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        visited = new boolean[n][n];
        for(int i=0; i<arr.length; i++) {
            String str = br.readLine();
            for(int j=0; j<str.length(); j++) {
                int value = str.charAt(j) - '0';
                arr[i][j] = value;
            }
        }

        int cnt = 0;
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                if(arr[i][j] == 1 && !visited[i][j]) {
                    cnt++;
                    int value = bfs(i, j);
                    answer.add(value);
                }
            }
        }
        System.out.println(cnt);
        Collections.sort(answer);
        for(int i=0; i<answer.size(); i++) {
            System.out.println(answer.get(i));
        }
    }

    public static int bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[x][y] = true;
        int cnt = 1;
        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int cx = current[0];
            int cy = current[1];

            for(int i=0; i<dx.length; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if(nx >= 0 && ny >= 0 && nx < arr.length && ny < arr[0].length) {
                    if(arr[nx][ny] == 1 && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        cnt++;
                        queue.add(new int[]{nx, ny, cnt});
                    }
                }
            }
        }
        return cnt;
    }
}