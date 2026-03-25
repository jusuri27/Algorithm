import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    static int[] answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[n+1][n+1];
        answer = new int[n+1];
        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        for(int i=1; i<arr.length; i++) {
            bfs(i, 0);
        }

        int min = Integer.MAX_VALUE;
        int result = 0;
        for(int i=answer.length-1; i>0; i--) {
            if(answer[i] <= min) {
                min = answer[i];
                result = i;
            }
        }
        System.out.println(result);
    }

    public static void bfs(int start, int depth) {
        boolean[] visited = new boolean[arr.length];
        visited[start] = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{start, 1});
        int sum = 0;
        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int begin = current[0];
            int cnt = current[1];

            for(int i=1; i<arr.length; i++) {
                if(arr[begin][i] == 1 && !visited[i]) {
                    sum += cnt;
                    visited[i] = true;
                    queue.add(new int[]{i, cnt + 1});
                }
            }
        }
        answer[start] = sum;
    }
}