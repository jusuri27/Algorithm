import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int[][] arr;
    static boolean[][][] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n][m];
        visited = new boolean[n][m][2];

        for(int i=0; i<arr.length; i++) {
            String str = sc.next();
            for(int j=0; j<str.length(); j++) {
                arr[i][j] = str.charAt(j) - '0';
            }
        }

        bfs(0,0);
    }
    public static void bfs(int x, int y) {
        visited[x][y][0] = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y, 0, 1});

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int cx = current[0];
            int cy = current[1];
            int broken = current[2];
            int cnt = current[3];

            if(cx == arr.length-1 && cy == arr[0].length -1) {
                System.out.println(cnt);
                return;
            }


            for (int i = 0; i < dx.length; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx >= 0 && ny >= 0 && nx < arr.length && ny < arr[0].length) {

                    // 통과 조건
                    if (arr[nx][ny] == 0 && !visited[nx][ny][broken]) {
                        visited[nx][ny][broken] = true;
                        queue.add(new int[]{nx, ny, broken, cnt + 1});
                    }

                    // 한번 부술수 있는 조건
                    if (arr[nx][ny] == 1 && !visited[nx][ny][1] && broken == 0) {
                        visited[nx][ny][1] = true;
                        queue.add(new int[]{nx, ny, 1, cnt + 1});
                    }
                }
            }
        }
        System.out.println(-1);
    }
}