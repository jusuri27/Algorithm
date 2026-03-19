import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<List<Integer>> arr = new ArrayList<>();
    static boolean[] visited;
    static int[] parent;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        visited = new boolean[n+1];
        parent = new int[n+1];

        for(int i=0; i<=n; i++) {
            arr.add(new ArrayList<>());
        }

        for(int i=0; i<n-1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            arr.get(a).add(b);
            arr.get(b).add(a);
        }

        dfs(1);

        for(int i=2; i<parent.length; i++) {
            System.out.println(parent[i]);
        }
    }

    public static void dfs(int start) {
        visited[start] = true;
        for(int i : arr.get(start)) {
            if(!visited[i]) {
                dfs(i);
                parent[i] = start;
            }
        }
    }
}

