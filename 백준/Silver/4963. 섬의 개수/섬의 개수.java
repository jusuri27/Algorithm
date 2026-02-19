import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    // 동 동남, 남, 서남, 서, 서북, 북, 동북
    static int[] dx = {1, 1, 0, -1, -1, -1, 0, 1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static int[][] arr;
    static boolean[][] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if(n == 0 && m == 0) {
                break;
            }

            arr = new int[m][n];
            visited = new boolean[m][n];

            for(int i=0; i<arr.length; i++) {
                for(int j=0; j<arr[i].length; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            int answer = 0;
            for(int i=0; i<arr.length; i++) {
                for(int j=0; j<arr[i].length; j++) {
                    if(arr[i][j] == 1 && !visited[i][j]) {
                        answer++;
                        bfs(i, j);
                    }
                }
            }
            System.out.println(answer);
        }
    }

    public static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[x][y] = true;

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
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }
    }
}