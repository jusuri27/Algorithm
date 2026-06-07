class Solution {
    public String solution(String s) {
        String answer = "";
        int count = 0;
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == ' ') {
                answer += ' ';
                count = 0;
            } else {
                count++;
                if(count % 2 == 0) {
                    ch = Character.toLowerCase(ch);
                    answer += ch;
                } else {
                    ch = Character.toUpperCase(ch);
                    answer += ch;
                }
            }
        }
        return answer;
    }
}
