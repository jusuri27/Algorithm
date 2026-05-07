class Solution {
    public String solution(int num) {
        String answer = "Even";
        if(num % 2 == 1 || num % 2 == -1) {
            answer = "Odd";
        }
        
        return answer;
    }
}