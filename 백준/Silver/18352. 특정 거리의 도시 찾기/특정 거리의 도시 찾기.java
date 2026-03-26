import java.util.*;

public class Main {
    static int k;
    static boolean[] visited;
    static List<List<Integer>> list;
    static List<Integer> answer = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        k = sc.nextInt();
        int x = sc.nextInt();
        visited = new boolean[n+1];

        list = new ArrayList<>();
        for(int i=0; i<=n; i++) {
            list.add(new ArrayList<>());
        }
        for(int i=0; i<m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            list.get(a).add(b);
        }

        bfs(x);
        answer.sort(null);
        if(answer.isEmpty()) {
            System.out.println(-1);
        } else {
            for(int i : answer) {
                System.out.println(i);
            }
        }
    }

    public static void bfs(int start) {
        visited[start] = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{start, 0});

        boolean found = false;
        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int now = current[0];
            int cnt = current[1];

            if(cnt == k) {
                found = true;
                answer.add(now);
            }
            for(Integer i : list.get(now)) {
                if(!visited[i]) {
                    visited[i] = true;
                    queue.add(new int[]{i, cnt + 1});
                }
            }
        }
    }
}

/*
n번 까지의 도시
m개의 단방향 도로
최단 거리가 k인 모든 도시 번호 출력
  - 도시 번호는 오름차순
  - 존재하지 않으면 -1
 */