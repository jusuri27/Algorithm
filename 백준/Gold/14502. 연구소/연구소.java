import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int[][] arr;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int max = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n][m];

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        dfs(0);
        System.out.println(max);
    }

    public static void dfs(int cnt) {
        if(cnt == 3) {
            bfs();
            return;
        }

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                if(arr[i][j] == 0) {
                    arr[i][j] = 1;
                    dfs(cnt + 1);
                    arr[i][j] = 0;
                }
            }
        }
    }

    public static void bfs() {
        boolean[][] visited = new boolean[arr.length][arr[0].length];
        Queue<int[]> queue = new LinkedList<>();

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                if(arr[i][j] == 2) {
                    queue.add(new int[]{i, j});
                    visited[i][j] = true;
                }
            }
        }

        int[][] copy = new int[arr.length][arr[0].length];
        for(int i=0; i<copy.length; i++) {
            copy[i] = arr[i].clone();
        }

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int cx = current[0];
            int cy = current[1];

            for(int i=0; i<dx.length; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if(nx >= 0 && ny >= 0 && nx < copy.length && ny <copy[0].length) {
                    if(!visited[nx][ny] && copy[nx][ny] == 0) {
                        visited[nx][ny] = true;
                        copy[nx][ny] = 2;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }

        int cnt = 0;
        for(int i=0; i<copy.length; i++) {
            for(int j=0; j<copy[i].length; j++) {
                if(copy[i][j] == 0) {
                    cnt++;
                }
            }
        }
        max = Math.max(max, cnt);
    }
}