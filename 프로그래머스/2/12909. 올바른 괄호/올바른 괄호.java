import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        if(s.charAt(0) == ')') {
            return false;
        }

        Queue<Boolean> queue = new LinkedList<>();
        for(int i=0; i<s.length(); i++) {
            char current = s.charAt(i);
            if(current == '(') {
                queue.add(true);
            } else {
                if(queue.isEmpty()) {
                    return false;
                }
                queue.poll();
            }
        }
        
        if(!queue.isEmpty()) {
            answer = false;
        }

        return answer;
    }
}