import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        int prev = arr[0];
        for(int i=1; i<arr.length; i++) {
            int current = arr[i];
            if(prev != current) {
                list.add(arr[i]);
                prev = current;
            }
        }
        int[] answer = new int[list.size()];
        int count = 0;
        for(int i : list) {
            answer[count] = list.get(count);
            count++;
        }
        return answer;
    }
}