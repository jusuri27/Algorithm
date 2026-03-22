import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<List<Integer>> list = new ArrayList<>();
    static boolean[] visited;
    static int[] parent;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        visited = new boolean[n+1];
        parent = new int[n+1];
        for(int i=0; i<=n; i++) {
            list.add(new ArrayList<>());
        }

        for(int i=1; i<n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            list.get(x).add(y);
            list.get(y).add(x);
        }

        dfs(1);

        for(int i=2; i<parent.length; i++) {
            System.out.println(parent[i]);
        }

    }

    public static void dfs(int start) {
        visited[start] = true;

        for(int i : list.get(start)) {
            if(!visited[i]) {
                parent[i] = start;
                dfs(i);
            }
        }
    }
}
// [[], [6], [4], [5], [1, 7], [], [3]]
// [[], [6, 4], [4], [6, 5], [1, 2, 7], [3], [1, 3], [4]]