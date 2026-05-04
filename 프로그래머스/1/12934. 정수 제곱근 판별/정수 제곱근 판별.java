import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        long max = 50000000000000L;
        long num = 1;
        List<Long> list = new ArrayList<>();
        while(num * num <= max) {
            list.add(num*num);
            num++;
        }
        long count = 0;
        for(long i : list) {
            count++;
            if(i == n) {
                answer = list.get((int) count);
                break;
            }
            if(i >= n) {
                answer = -1;
                break;
            }
        }
        return answer;
    }
}