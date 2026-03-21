import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int[][] arr;
    static boolean[][] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n][m];
        visited = new boolean[n][m];

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                int value = sc.nextInt();
                if(value == 1) {
                    arr[i][j] = -1;
                } else {
                    arr[i][j] = value;
                }
            }
        }

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                if(arr[i][j] == 2 && !visited[i][j]) {
                    bfs(i, j);
                }
            }
        }

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void bfs(int x, int y) {
        visited[x][y] = true;
        arr[x][y] = 0;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y, 1});

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int cx = current[0];
            int cy = current[1];
            int cnt = current[2];

            for(int i=0; i<dx.length; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if(nx >= 0 && ny >= 0 && nx < arr.length && ny < arr[0].length) {
                    if(arr[nx][ny] == -1 && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        arr[nx][ny] = cnt;
                        queue.add(new int[]{nx, ny, cnt+1});
                    }
                }
            }
        }
    }
}