import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            min = Math.min(min, Integer.parseInt(arr[i]));
            max = Math.max(max, Integer.parseInt(arr[i]));
        }
        answer = min + " " + max;
        System.out.println(Arrays.toString(arr));
        System.out.println(answer);
        return answer;
    }
}