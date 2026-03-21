import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int[] move = new int[2];
    static int g;
    static int f;

    static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        f = sc.nextInt();
        int s = sc.nextInt();
        g = sc.nextInt();
        int u = sc.nextInt();
        int d = sc.nextInt();
        move[0] = u;
        move[1] = -d;
        visited = new boolean[f+1];

        bfs(s);
    }

    public static void bfs(int start) {
        visited[start] = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{start, 0});

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int now = current[0];
            int cnt = current[1];

            if(now == g) {
                System.out.println(cnt);
                return;
            }

            for(int i=0; i<move.length; i++) {
                int next = now + move[i];
                if(next > 0 && next <= f && !visited[next]){
                    visited[next] = true;
                    queue.add(new int[]{next, cnt + 1});
                }
            }
        }
        System.out.println("use the stairs");
    }
}

/*
1 3 5 7 9 8 10
총층 : f
현재층 : s
타겟층 : g
위로 : u
아래로 : d
 */