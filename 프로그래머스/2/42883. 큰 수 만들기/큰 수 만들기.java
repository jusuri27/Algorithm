class Solution {
    public String solution(String number, int k) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        int count = number.length() - k;
        
        for(int i=0; i<count; i++) {
            int max = 0;
            for(int j=idx; j<=i+k; j++) {
                if(number.charAt(j) - '0' > max) {
                    max = number.charAt(j) - '0';
                    idx = j+1;
                }
            }
            sb.append(max);
        }
        return sb.toString();
    }
}