import java.util.*;

public class Main {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int[][] arr;
    static boolean[][] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        arr = new int[m][n];
        visited = new boolean[m][n];

        for(int i=0; i<k; i++) {
            int lx = sc.nextInt();
            int ly = sc.nextInt();
            int rx = sc.nextInt();
            int ry = sc.nextInt();

            for(int x=lx; x<rx; x++) {
                for(int y=ly; y<ry; y++) {
                    arr[x][y] = 1;
                }
            }
        }

        List<Integer> answer = new ArrayList<>();
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                if(arr[i][j] == 0 && !visited[i][j]) {
                    int value = bfs(i, j);
                    count++;
                    if(value != 0) {
                        answer.add(value);
                    }
                }
            }
        }
        answer.sort(null);
        System.out.println(count);
        for(int val : answer) {
            System.out.print(val + " ");
        }
    }

    public static int bfs(int x, int y) {
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
                    if(arr[nx][ny] == 0 && !visited[nx][ny]){
                        visited[nx][ny] = true;
                        queue.add(new int[]{nx, ny});
                        count++;
                    }
                }
            }

            if(queue.isEmpty()) {
                break;
            }
        }
        return count;
    }
}