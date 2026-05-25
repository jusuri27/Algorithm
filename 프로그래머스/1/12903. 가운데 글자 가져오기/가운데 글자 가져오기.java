class Solution {
    public String solution(String s) {
        String answer = "";
        int mid = s.length() / 2;
        if(s.length() % 2 == 1) {
            answer = String.valueOf(s.charAt(mid));
        } else {
            answer = s.substring(mid - 1, mid + 1);
        }
        return answer;
    }
}