import java.util.*;

public class Main {
    static int[][] arr;
    static int n;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int max = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][n];
        int maxNum = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length; j++) {
                int value = sc.nextInt();
                arr[i][j] = value;
                maxNum = Math.max(maxNum, value);
            }
        }

        for(int i=0; i<=maxNum; i++) {
            solve(i);
        }
        System.out.println(max);
    }

    public static void solve(int target) {
        visited = new boolean[n][n];
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                if(!visited[i][j] && arr[i][j] > target) {
                    count++;
                    bfs(i, j, target);
                }
            }
        }
        max = Math.max(max, count);
    }

    public static void bfs(int x, int y, int target) {
        visited[x][y] = true;
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{x, y});

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int cx = current[0];
            int cy = current[1];

            for(int i=0; i<dx.length; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if(nx >= 0 && ny >= 0 && nx < arr.length && ny < arr[0].length) {
                    if(!visited[nx][ny] && arr[nx][ny] > target) {
                        visited[nx][ny] = true;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }
    }
}


/*
최대 영역을 구한다
높이가 1일때
높이가 2일때
높이가 최댓값일때
 */