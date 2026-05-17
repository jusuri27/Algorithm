import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        int size = 0;
        
        for(int i : arr) {
            if(i % divisor == 0) {
                list.add(i);
                size++;
            }
        }
        
        if(size == 0) {
            int[] answer = {-1};
            return answer;
        }
        
        int[] answer = new int[size];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}