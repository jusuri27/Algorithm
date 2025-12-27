import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {0, 0};
        List<Integer> divisors = new ArrayList<>();
        // if(brown == 12 && yellow == 4) {
        //     answer[0] = 4;
        //     answer[1] = 4;
        //     return answer;
        // }
        
        for(int i=1; i<=yellow; i++) {
            if(yellow % i == 0) {
                divisors.add(i);
            }
        }
        
        Collections.sort(divisors, Collections.reverseOrder());
        int number = 4;
        for(int i=0; i<divisors.size(); i++) {
            number += (divisors.get(i) * 2);
            int col = 0;
            for(int j=0; j<yellow/divisors.get(i); j++) {
                number += 2;
                col++;
                // System.out.println("brown : " + brown);
                // System.out.println("number : " + number);
                // System.out.println("yellow/divisors.get(i) " + yellow/divisors.get(i));
                // System.out.println("divisors.get(i) " + divisors.get(i));
            }
            if(brown == number) {
                answer[0] = divisors.get(i) + 2;
                answer[1] = col + 2;
                return answer;
            }
            number = 4;
        }
        return answer;
    }
}

// 4
// 1, 2, 4

// 24
// 1, 2, 3, 4, 6, 8, 12, 24

// ㄱㄱㄱㄱ    ㄱㄱㄱㄱ
// ㄱㄴㄴㄱ    ㄱㄴㄴㄱ
// ㄱㄱㄱㄱ    ㄱㄴㄴㄱ
//            ㄱㄱㄱㄱ
// 10 - 2     12 - 4

// ㄱㄱㄱㄱㄱ   ㄱㄱㄱㄱㄱ   ㄱㄱㄱㄱㄱ
// ㄱㄴㄴㄴㄱ   ㄱㄴㄴㄴㄱ   ㄱㄴㄴㄴㄱ
// ㄱㄱㄱㄱㄱ   ㄱㄴㄴㄴㄱ   ㄱㄴㄴㄴㄱ
//            ㄱㄱㄱㄱㄱ    ㄱㄴㄴㄴㄱ
//                        ㄱㄱㄱㄱㄱ
// 12 - 3     14 - 6       16 - 9

// ㄱㄱㄱㄱㄱㄱ  ㄱㄱㄱㄱㄱㄱ  ㄱㄱㄱㄱㄱㄱ  ㄱㄱㄱㄱㄱㄱ
// ㄱㄴㄴㄴㄴㄱ  ㄱㄴㄴㄴㄴㄱ  ㄱㄴㄴㄴㄴㄱ  ㄱㄴㄴㄴㄴㄱ
// ㄱㄱㄱㄱㄱㄱ  ㄱㄴㄴㄴㄴㄱ  ㄱㄴㄴㄴㄴㄱ  ㄱㄴㄴㄴㄴㄱ
//             ㄱㄱㄱㄱㄱㄱ  ㄱㄴㄴㄴㄴㄱ  ㄱㄴㄴㄴㄴㄱ
//                         ㄱㄱㄱㄱㄱㄱ  ㄱㄴㄴㄴㄴㄱ
//                                     ㄱㄱㄱㄱㄱㄱ
// 14 - 4      16 - 8      18 - 12        20 - 16

// ㄱㄱㄱㄱㄱㄱㄱ
// ㄱㄴㄴㄴㄴㄴㄱ
// ㄱㄱㄱㄱㄱㄱㄱ
// 16 - 5

// ㄱㄱㄱㄱㄱㄱㄱㄱㄱㄱ
// ㄱㄴㄴㄴㄴㄴㄴㄴㄴㄱ
// ㄱㄴㄴㄴㄴㄴㄴㄴㄴㄱ
// ㄱㄴㄴㄴㄴㄴㄴㄴㄴㄱ
// ㄱㄱㄱㄱㄱㄱㄱㄱㄱㄱ


// ㄱㄱㄱㄱㄱㄱㄱㄱ
// ㄱㄴㄴㄴㄴㄴㄴㄱ
// ㄱㄴㄴㄴㄴㄴㄴㄱ
// ㄱㄴㄴㄴㄴㄴㄴㄱ
// ㄱㄴㄴㄴㄴㄴㄴㄱ
// ㄱㄱㄱㄱㄱㄱㄱㄱ
// 24 - 24