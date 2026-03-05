import java.util.Scanner;

public class Main {
    static int n;
    static int[][] arr;
    static boolean[] visited;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][n];
        visited = new boolean[n];

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        visited[0] = true;
        dfs(0, 0,  0, 1);
        System.out.println(min);
    }
    public static void dfs(int start, int now, int cost, int depth) {
        if(depth == n) {
            if(arr[now][start] != 0) {
                min = Math.min(min, cost + arr[now][start]);
            }
            return;
        }
        for(int i=0; i<n; i++) {
            if(!visited[i] && arr[now][i] != 0) {
                visited[i] = true;
                dfs(start, i, cost + arr[now][i], depth + 1);
                visited[i] = false;
            }
        }
    }
}