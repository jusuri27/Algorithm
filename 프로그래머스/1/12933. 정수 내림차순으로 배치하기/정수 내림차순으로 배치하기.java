import java.util.*;

class Solution {
    public long solution(long n) {
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr, Comparator.reverseOrder());
        long answer = Long.parseLong(String.join("", arr));
        return answer;
    }
}