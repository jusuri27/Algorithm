import java.util.*;

class Solution {
    static int answer = 0;
    public int solution(String begin, String target, String[] words) {
        int cnt = 0;
        boolean[] visited = new boolean[words.length];
        dfs(begin, target, words, cnt, visited);
        System.out.println(answer);
        return answer;
    }
    public void dfs(String begin, String target, String[] words, int cnt, boolean[] visited) {
        
        if(begin.equals(target)) {
            answer = cnt;
            return;
        }
        for(int i=0; i<words.length; i++) {
            int k = 0;
            
            for(int j=0; j<begin.length(); j++) {
                if(begin.charAt(j) == words[i].charAt(j)) {
                    k++;
                }
            }
            if(!visited[i] && k >= begin.length() - 1) {
                visited[i] = true;
                dfs(words[i], target, words, cnt+1, visited);
                visited[i] = false;
            }
        }
    }
}