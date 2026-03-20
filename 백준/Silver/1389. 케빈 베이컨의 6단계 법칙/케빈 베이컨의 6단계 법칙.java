import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int sum = 0;
    static int[][] arr;
    static boolean[] visited;
    static int min = Integer.MAX_VALUE;
    static int[] answer;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n+1][n+1];
        visited =new boolean[n+1];
        answer = new int[n+1];

        for(int i=0; i<m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        for(int i=1; i<arr.length; i++) {
            if(!visited[i]) {
                sum = 0;
                visited[i] = true;
                boolean[] tempVisited = Arrays.copyOf(visited, visited.length);
                bfs(i, 1, tempVisited);
                visited[i] = false;
            }
        }

        int min = Integer.MAX_VALUE;
        int result = 0;
        for(int i=answer.length-1; i>0; i--) {
            if(answer[i] <= min) {
                min = answer[i];
                result = i;
            }
        }
        System.out.println(result);
    }

    public static void bfs(int start, int count, boolean[] visited) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{start, count});
        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int idx = current[0];
            int cnt = current[1];

            for(int i=0; i<arr.length; i++) {
                if(!visited[i] && arr[idx][i] == 1) {
                    sum += cnt;
                    visited[i] = true;
                    queue.add(new int[]{i, cnt+1});
                }
            }
        }
        answer[start] = sum;
    }
}

/*
1 1 2 2 3
최대 6단계
1 -> 3
1 -> 4
2 -> 3
3 -> 4
4 -> 5

최소 몇 단계인지 구하기!!
케빈 베이컨의 수가 가장 작은 사람을 출력한다.
그런 사람이 여러 명일 경우에는 번호가 가장 작은 사람.
 */