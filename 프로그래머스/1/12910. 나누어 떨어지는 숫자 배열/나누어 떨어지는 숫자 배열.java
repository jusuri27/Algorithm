import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        
        boolean found = false;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] % divisor == 0) {
                found = true;
                list.add(arr[i]);
            }
        }
        
        if(!found) {
            list.add(-1);
        }
        list.sort(null);
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}