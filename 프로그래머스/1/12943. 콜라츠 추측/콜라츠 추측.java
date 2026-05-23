class Solution {
    public int solution(int num) {
        int answer = -1;
        if(num == 1) {
            answer = 0;
            return answer;
        } 
        for(int i=1; i<=500; i++) {
            if(num % 2 == 1) {
                num *= 3;
                num += 1;
            } else {
                num /= 2;
            }
            
            if(num == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}