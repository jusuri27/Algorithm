import java.util.Arrays;
import java.util.Scanner;
public class Main {
    static int answer = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] map = new int[m+1][m+1];
        boolean[] visited = new boolean[m+1];
        for(int i=0; i<n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            map[x][y] = 1;
            map[y][x] = 1;
        }
        dfs(visited, map, 1);
        System.out.println(answer);
    }
    public static void dfs(boolean[] visited, int[][] map, int start) {
        visited[start] = true;
        for(int i=1; i<map.length; i++) {
            if(!visited[i] && map[start][i] == 1) {
                answer++;
                dfs(visited, map, i);
            }
        }
    }
}