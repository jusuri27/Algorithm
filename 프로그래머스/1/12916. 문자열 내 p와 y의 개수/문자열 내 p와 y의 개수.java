class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int countP = 0;
        int countY = 0;
        
        for(int i=0; i<s.length(); i++) {
            char value = s.charAt(i);
            if(value == 'P' || value == 'p') {
                countP++;
            }
            if(value == 'Y' || value == 'y') {
                countY++;
            }
        }
        
        if(countP != countY) {
            answer = false;
        }
        
        return answer;
    }
}