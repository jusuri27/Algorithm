import java.util.*;

class Solution {
    public int[] solution(long n) {
        String[] arr = String.valueOf(n).split("");
        System.out.println(Arrays.toString(arr));
        int[] answer = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            answer[i] = Integer.parseInt(arr[arr.length - (i + 1)]);
        }
        return answer;
    }
}