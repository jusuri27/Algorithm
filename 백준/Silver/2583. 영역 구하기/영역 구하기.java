import java.util.*;

public class Main {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int[][] arr;
    static boolean[][] visited;
    static List<Integer> answer = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        arr = new int[m][n];
        visited = new boolean[m][n];

        for(int t=0; t<k; t++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for(int i=y1; i<y2; i++) {
                for(int j=x1; j<x2; j++) {
                    arr[i][j] = 1;
                }
            }
        }

        int count = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                if(!visited[i][j] && arr[i][j] == 0) {
                    count++;
                    bfs(i, j);
                }
            }
        }
        System.out.println(count);
        answer.sort(null);
        for(int i : answer) {
            System.out.print(i + " ");
        }
    }

    public static void bfs(int x, int y) {
        visited[x][y] = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});

        int count = 1;
        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int cx = current[0];
            int cy = current[1];

            for(int i=0; i<dx.length; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if(nx >= 0 && ny >= 0 && nx < arr.length && ny < arr[0].length) {
                    if(arr[nx][ny] == 0 && !visited[nx][ny]) {
                        count++;
                        visited[nx][ny] = true;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }
        answer.add(count);
    }
}

/*
m : 가로
n : 세로
k : 좌표 개수

 */