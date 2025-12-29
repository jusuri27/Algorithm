import java.util.*;
// 방문한 곳인지 체크하는 변수 만든다
    // queue에 시작점 세팅
    // while문으로 queue를 꺼내면서 동서남북 방향으로 이동 가능한값 확인
      // 다음 이동하는 값일때 return문
      // 동서남북 체크하는 반복문
      // 이동 조건
        // 이동할 값(x,y)가 0 이상
        // x, y값이 map의 크기보다 작아야한다
        // 이동할 값이 벽이 없는 자리(1)이어야 함
        // 이동할 값이 방문한 적이 없어야함

class Solution {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public int solution(int[][] maps) {
        int answer = 0;
        int n = maps.length;
        int m = maps[0].length;
        
        boolean[][] visited = new boolean[n][m];
        visited[0][0] = true;
        
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0, 1});
        
        
        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int cnt = current[2];
            
            if(n-1 == x && m-1 == y) {
                return cnt;
            }
            
            for(int i=0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx >=0 && ny >= 0 && nx < n && ny < m && maps[nx][ny] == 1 && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny, cnt+1});
                }
            }
        }
        return -1;
    }
}