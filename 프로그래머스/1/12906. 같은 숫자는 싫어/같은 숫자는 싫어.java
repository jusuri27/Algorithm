import java.util.*;

public class Solution {
    public int[] solution(int []arr) {        
        List<Integer> list = new ArrayList<>();
        int prev = arr[0];
        list.add(prev);
        for(int i=1; i<arr.length; i++) {
            int current = arr[i];
            if(prev == current) {
                continue;
            } else {
                list.add(current);
                prev = current;
            }
        }
        int[] answer = list.stream()
                  .mapToInt(Integer::intValue)
                  .toArray();;
        
        return answer;
    }
}