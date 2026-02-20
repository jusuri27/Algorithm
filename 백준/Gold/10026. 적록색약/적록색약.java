import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static boolean[][] visitedA;
    static boolean[][] visitedB;
    static char[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new char[n][n];
        visitedA = new boolean[n][n];
        visitedB = new boolean[n][n];

        for(int i=0; i<arr.length; i++) {
            String str = br.readLine();
            for(int j=0; j<str.length(); j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        int countA = 0;
        int countB = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                if(!visitedA[i][j]) {
                    countA++;
                    bfs(arr[i][j], 'A', i, j);
                }
                if(!visitedB[i][j]) {
                    countB++;
                    bfs(arr[i][j], 'B', i, j);
                }
            }
        }
        System.out.println(countA + " " + countB);
    }

    public static void bfs(char target, char type, int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        if(type == 'A') {
            visitedA[x][y] = true;
        } else {
            visitedB[x][y] = true;
        }

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int cx = current[0];
            int cy = current[1];

            for(int i=0; i<dx.length; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if(nx >= 0 && ny >= 0 && nx < arr.length && ny <arr[0].length) {
                    if(type == 'A') {
                        if(arr[nx][ny] == target && !visitedA[nx][ny]) {
                            visitedA[nx][ny] = true;
                            queue.add(new int[]{nx, ny});
                        }
                    } else {
                        if(!visitedB[nx][ny]) {
                            if(arr[nx][ny] == target && target == 'B') {
                                visitedB[nx][ny] = true;
                                queue.add(new int[]{nx, ny});
                            }
                            if(target != 'B' && (arr[nx][ny] == 'R' || arr[nx][ny] == 'G')) {
                                visitedB[nx][ny] = true;
                                queue.add(new int[]{nx, ny});
                            }
                        }

                    }
                }
            }
        }
    }
}