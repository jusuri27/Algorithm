import java.util.Scanner;

public class Main {
    static int[][] arr;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n+1][n+1];
        visited = new boolean[n+1];

        for(int i=0; i<m; i++) {
            int j = sc.nextInt();
            int k = sc.nextInt();
            arr[j][k] = 1;
            arr[k][j] = 1;
        }

        int answer = 0;
        for(int i=1; i<arr.length; i++) {
            if(!visited[i]) {
                answer++;
                dfs(i);
            }
        }
        System.out.println(answer);
    }

    public static void dfs(int i) {
        visited[i] = true;
        for(int j=1; j<arr.length; j++) {
            if(!visited[j] && arr[i][j] == 1) {
                dfs(j);
            }
        }
    }
}