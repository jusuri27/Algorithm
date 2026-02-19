import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int answer = Integer.MAX_VALUE;
    static int[][] arr;
    static Queue<int[]> queue = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[m][n];

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                int value = sc.nextInt();
                arr[i][j] = value;
                if(value == 1) {
                    queue.add(new int[]{i, j, 0});
                }
            }
        }
        bfs();
        if(answer == Integer.MAX_VALUE) {
            System.out.println(0);
        } else {
            System.out.println(answer);
        }
    }

    public static void bfs() {
        int cnt = 0;
        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int cx = current[0];
            int cy = current[1];
            cnt = current[2];

            for(int i=0; i<dx.length; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if(nx >= 0 && ny >= 0 && nx < arr.length && ny < arr[0].length) {
                    if(arr[nx][ny] == 0) {
                        arr[nx][ny] = 1;
                        queue.add(new int[]{nx, ny, cnt+1});
                    }
                }
            }
        }


        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                if(arr[i][j] == 0) {
                    System.out.println(-1);
                    System.exit(0);
                }
            }
        }
        answer = Math.min(answer, cnt);
    }
}

/*
1 0 0
0 1 0
0 0 1

1 0 0 0 1
0 0 0 0 0
0 0 1 0 0
0 0 0 0 0
0 0 0 0 1

 */