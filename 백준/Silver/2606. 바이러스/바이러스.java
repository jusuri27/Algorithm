import java.util.*;

public class Main {
    public static int m, n;
    public static int[][] node;
    public static boolean[] visited;
    public static int cnt;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        m = sc.nextInt();
        n = sc.nextInt();

        node = new int[m+1][m+1];
        visited = new boolean[m+1];

        for(int i=0; i<n; i++) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            node[m][n] = node[n][m] = 1;
        }
        visited[1] = true;
        dfs(node, visited, 1);
        System.out.println(cnt);
    }

    public static void dfs(int[][] node, boolean[] visited, int begin) {
        for(int i=0; i<node.length; i++) {
            if(!visited[i] && node[begin][i] == 1) {
                visited[i] = true;
                cnt++;
                dfs(node, visited, i);
            }
        }
    }
}