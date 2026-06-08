class Solution {
    public String solution(int[] food) {
        String answer = "";
        String str = "";
        for(int i=1; i<food.length; i++) {
            String current = "";
            for(int j=0; j<food[i] / 2; j++) {
                current += i;
            }
            str += current;
        }
        answer = str + "0" + new StringBuilder(str).reverse().toString();
        return answer;
    }
}