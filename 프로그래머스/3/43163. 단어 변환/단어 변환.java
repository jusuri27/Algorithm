class Solution {
    static int answer;
    static boolean[] visited;
    public int solution(String begin, String target, String[] words) {
        answer = Integer.MAX_VALUE;
        visited = new boolean[words.length];
        
        dfs(begin, target, words, 0);
        
        if(answer == Integer.MAX_VALUE) {
            answer = 0;
        }
        
        return answer;
    }
    
    public void dfs(String begin, String target, String[] words, int cnt) {
        if(begin.equals(target)) {
            answer = Math.min(answer, cnt);
            return;
        }
        
        for(int i=0; i<words.length; i++) {
            int k = 0;
            
            if(visited[i]) {
               continue; 
            }
            for(int j=0; j<words[i].length(); j++) {
                if(begin.charAt(j) == words[i].charAt(j)) {
                    k++;
                }
            }
            
            if(k >= begin.length() - 1) {
                visited[i] = true;
                dfs(words[i], target, words, cnt+1);
                visited[i] = false;
            }
        }
    }
}