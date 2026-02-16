import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int[][] arr;
    static boolean[][] visited;
    static int m;
    static int n;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            m = sc.nextInt();
            n = sc.nextInt();
            int cnt = sc.nextInt();

            arr = new int[m][n];
            visited = new boolean[m][n];
            for(int j=0; j<cnt; j++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                arr[x][y] = 1;
            }

            int value = 0;
            int answer = 0;
            for(int j=0; j<arr.length; j++) {
                if(value == cnt) {
                    break;
                }
                for(int k=0; k<arr[j].length; k++) {
                    if(arr[j][k] == 1 && !visited[j][k]) {
                        visited[j][k] = true;
                        value += bfs(j, k, 1);
                        answer++;
                    }
                }
            }
            System.out.println(answer);
        }
    }

    public static int bfs(int x, int y, int cnt) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y, cnt});
        while(true) {
            int[] current = queue.poll();
            int cx = current[0];
            int cy = current[1];
            int count = current[2];

            for(int i=0; i<dx.length; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if(nx >= 0 && ny >= 0 && nx < m && ny < n) {
                    if(arr[nx][ny] == 1 && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        count = count+1;
                        queue.add(new int[]{nx, ny, count+1});
                    }
                }
            }
            if(queue.isEmpty()) {
                return count;
            }
        }
    }
}