import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        ArrayDeque<Character> arr = new ArrayDeque<>();
        arr.push(s.charAt(0));
        for(int i=1; i<s.length(); i++) {
            Character current = s.charAt(i);
            if(arr.peek() == current) {
                arr.pop();
            } else {
                arr.push(current);
            }
        }
        if(arr.isEmpty()) {
            answer = 1;
        }
        
        return answer;
    }
}