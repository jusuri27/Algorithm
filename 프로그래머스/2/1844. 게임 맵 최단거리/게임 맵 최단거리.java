import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;

class Solution {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static boolean[][] visited;
    public int solution(int[][] maps) {
        int answer = 0;
        visited = new boolean[maps.length][maps[0].length];
        Queue<int[]> queue = new LinkedList<>();
        
        queue.add(new int[]{0, 0, 1});
        visited[0][0] = true;
        
        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int cx = current[0];
            int cy = current[1];
            int cnt = current[2];
            
            if(cx == maps.length - 1 && cy == maps[0].length - 1) {
                answer = cnt;
                return answer;
            }
            
            for(int i=0; i<4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if(nx >= 0 && ny >= 0 && nx < maps.length && ny < maps[0].length && !visited[nx][ny] && maps[nx][ny] == 1) {
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny, cnt+1});
                }
            }
        }
        return -1;
    }
}











