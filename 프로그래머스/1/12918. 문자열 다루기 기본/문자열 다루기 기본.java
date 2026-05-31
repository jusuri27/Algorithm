class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length() != 4 && s.length() != 6) {
            answer = false;
        }
        
        for(int i=0; i<s.length(); i++) {
            char value = s.charAt(i);
            if(!Character.isDigit(value)) {
                answer = false;
            }
        }
        return answer;
    }
}