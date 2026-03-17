import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int[] move;
    static boolean[] visited;
    static int f;
    static int g;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        f = sc.nextInt();
        int s = sc.nextInt();
        g = sc.nextInt();
        int u = sc.nextInt();
        int d = sc.nextInt();
        move = new int[2];

        move[0] = u;
        move[1] = -d;
        visited = new boolean[f+1];
        bfs(s);
    }

    public static void bfs(int start) {
        int count = 0;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{start, count});
        visited[start] = true;
        while(!queue.isEmpty()) {
            int[] value = queue.poll();
            int current = value[0];
            int cnt = value[1];

            if(current == g) {
                System.out.println(cnt);
                return;
            }

            for(int i=0; i<move.length; i++) {
                int next = current + move[i];
                if(next <= f && next >= 1 && !visited[next]) {
                    visited[next] = true;
                    queue.add(new int[]{next, cnt+1});
                }
            }
        }
        System.out.println("use the stairs");
    }
}
// 3 5 7 9
// f : 최고층
// s : 현재층
// g : 타겟층
// u : 위로
// d : 아래로