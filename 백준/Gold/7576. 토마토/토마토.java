import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[m][n];
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        for(int i=0; i<arr.length; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<arr[i].length; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Queue<int[]> queue = new LinkedList<>();
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                if(arr[i][j] == 1) {
                    queue.add(new int[]{i, j, 0});
                }
            }
        }

        int answer = 0;
        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int cx = current[0];
            int cy = current[1];
            int cnt = current[2];

            for(int i=0; i<dx.length; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if(nx >= 0 && ny >= 0 && nx < arr.length && ny < arr[0].length) {
                    if(arr[nx][ny] == 0) {
                        arr[nx][ny] = cnt + 1;
                        queue.add(new int[]{nx, ny, cnt+1});
                    }
                }
            }
            if(queue.isEmpty()) {
                answer = cnt;
            }
        }


        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                if(arr[i][j] == 0) {
                    answer = -1;
                }
            }
        }
        System.out.println(answer);
    }
}