import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new TreeSet<>();
        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                int value = numbers[i] + numbers[j];
                set.add(value);
            }
        }
        
        int[] answer = new int[set.size()];
        int count = 0;
        for(int i : set) {
            answer[count] = i;
            count++;
        }
        
        return answer;
    }
}