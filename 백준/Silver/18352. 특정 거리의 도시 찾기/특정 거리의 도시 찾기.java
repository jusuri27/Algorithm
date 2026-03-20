import java.util.*;

public class Main {
    static int k;
    static List<List<Integer>> arr;
    static boolean[] visited;
    static List<Integer> answer = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        k = sc.nextInt();
        int x = sc.nextInt();
        arr = new ArrayList<>();
        visited = new boolean[n+1];

        for(int i=0; i<=n; i++) {
            arr.add(new ArrayList<>());
        }

        for(int i=0; i<m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            arr.get(a).add(b);
        }
        bfs(x, 0);
        answer.sort(null);
        if(answer.isEmpty()) {
            System.out.println(-1);
        } else {
            for(int i : answer) {
                System.out.println(i);
            }
        }
    }

    public static void bfs(int start, int depth) {
        visited[start] = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{start, depth});

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int idx = current[0];
            int cnt = current[1];

            if(cnt == k) {
                answer.add(idx);
            }
            for(int i : arr.get(idx)) {
                if(!visited[i]) {
                    visited[i] = true;
                    queue.add(new int[]{i, cnt+1});
                }
            }
        }
    }
}

/*
도시의 개수 n
도로의 개수 m
거리 정보 k
출발 도시 번호 x
 */