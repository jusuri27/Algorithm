class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int countP = 0;
        int countY = 0;
        
        for(int i=0; i<s.length(); i++) {
            char value = s.charAt(i);
            if(value == 'p' || value == 'P') {
                countP++;
            }
            if(value == 'y' || value == 'Y') {
                countY++;
            }
        }
        
        if(countP == countY) {
            answer = true;
        }

        return answer;
    }
}