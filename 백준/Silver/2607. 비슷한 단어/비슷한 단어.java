import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String baseWord = sc.nextLine();
        int[] baseCount = new int[26];
        for(int value : baseWord.toCharArray()) {
            baseCount[value - 'A']++;
        }

        int result = 0;
        for(int i=1; i<n; i++) {
            String word = sc.nextLine();
            int[] wordCount = new int[26];
            for(int value : word.toCharArray()) {
                wordCount[value - 'A']++;
            }
            int diff = 0;
            for(int j=0; j<baseCount.length; j++) {
                diff += Math.abs(baseCount[j] - wordCount[j]);
            }

            if(diff <= 1) {
                result++;
            } else if(diff == 2 && baseWord.length() == word.length()) {
                result++;
            }
        }
        System.out.println(result);
    }
}

/*
- 알파벳 개수로 비교 (A~Z 카운팅)
- 기준 단어와 비교 단어의 문자 개수 차이 합을 구함
- 조건
  - 문자 차이 합이 0
    - ABC - ABC
  - 문자 차이 합이 1
    - ABC - ABCA, ABC - AB
  - 또는 2인데 길이가 같으면 → 비슷 (교체 가능)
    - ABD - ABG
 */