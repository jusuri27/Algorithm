class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        int mod = 0;
        for(int i=1; i<arr.length; i++) {
            mod = GCD(answer, arr[i]);
            answer = LCM(answer, arr[i], mod);
        }
        return answer;
    }
    public int GCD(int a, int b) {
        if(a % b == 0) {
            return b;
        }
        return GCD(b, a % b);
    }
    
    public int LCM(int a, int b, int value) {
        return a * b / value;
    }
}