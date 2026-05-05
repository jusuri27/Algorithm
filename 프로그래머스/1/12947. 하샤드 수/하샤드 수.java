import java.util.*;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String[] str = String.valueOf(x).split("");
        
        int sum = 0;
        for(int i=0; i<str.length; i++) {
            sum += Integer.parseInt(str[i]);
        }
        
        if(x % sum != 0) {
            answer = false;
        }
        return answer;
    }
}