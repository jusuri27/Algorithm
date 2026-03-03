import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int[][] arr;
    static int[][] temp;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int max = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n][n];

        int maxNum = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                int value = sc.nextInt();
                arr[i][j] = value;
                maxNum = Math.max(maxNum, value);
            }
        }

        for(int i=0; i<=maxNum; i++) {
            init(i);
        }
        System.out.println(max);
    }

    public static void init(int n) {
        temp = new int[arr.length][arr.length];
        visited = new boolean[arr.length][arr.length];
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                if(arr[i][j] > n) {
                    temp[i][j] = -1;
                }
            }
        }

        int count = 0;
        for(int i=0; i<temp.length; i++) {
            for(int j=0; j<temp[i].length; j++) {
                if(temp[i][j] == -1 && !visited[i][j]) {
                    count++;
                    visited[i][j] = true;
                    bfs(i, j);
                }
            }
        }
        max = Math.max(max, count);
    }

    public static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int cx = current[0];
            int cy = current[1];

            for(int i=0; i<dx.length; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if(nx >=0 && ny >= 0 && nx < temp.length && ny < temp[0].length) {
                    if(temp[nx][ny] == -1 && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }
    }
}