class Solution {
    static boolean[] visited;
    public int solution(int n, int[][] computers) {
        visited = new boolean[n];
        int answer = 0;
        
        for(int i=0; i<n; i++) {
            if(!visited[i]) {
                dfs(i, computers);
                answer++;
            }
        }
        
        return answer;
    }
    public void dfs(int i, int[][] computers) {
        visited[i] = true;
        for(int j=0; j<computers.length; j++) {
            if(!visited[j] && computers[j][i] == 1) {
                dfs(j, computers);
            }
        }
    }
}