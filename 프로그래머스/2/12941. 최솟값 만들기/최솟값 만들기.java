import java.util.*;

class Solution {
    public int solution(int []A, int []B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        int[] newB = new int[B.length];
        for(int i=0; i<B.length; i++) {
            int idx = i + 1;
            newB[i] = B[B.length - idx];
            answer += A[i] * newB[i];
        }
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(newB));
        
        return answer;
    }
}