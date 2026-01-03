class Solution {
    static boolean[] visited;
    static int answer = 0;
    
    public int solution(int n, int[][] computers) {
        visited = new boolean[n];
        
        for(int i=0; i<computers.length; i++) {
            if(!visited[i]) {
                answer++;
                dfs(computers, i);
            }
        }
        return answer;
    }
    public void dfs(int[][] computers, int i) {
        visited[i] = true;
        for(int j=0; j<computers.length; j++) {
            if(!visited[j] && computers[i][j] == 1) {
                dfs(computers, j);
            }
        }
    }
}