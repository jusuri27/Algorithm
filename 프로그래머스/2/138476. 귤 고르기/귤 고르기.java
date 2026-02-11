import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Integer[] arr = new Integer[20000000];
        Arrays.fill(arr, 0);
        for(int i=0; i<tangerine.length; i++) {
            arr[tangerine[i]]++;
        }
        Arrays.sort(arr, Comparator.reverseOrder());
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
            if(sum >= k) {
                answer = i+1;
                break;
            }
        }
        return answer;
    }
}