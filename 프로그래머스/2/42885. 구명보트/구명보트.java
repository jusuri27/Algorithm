// 보트 한개에 최대 2명

import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int left = 0;
        int right = people.length-1;
        
        while(true) {
            if(left > right) {
                return answer;
            }
            
            if(people[left] + people[right] <= limit) {
                left++;
                right--;
            } else {
                right--;
            }
            answer++;
        }
        
        // return answer;
    }
}