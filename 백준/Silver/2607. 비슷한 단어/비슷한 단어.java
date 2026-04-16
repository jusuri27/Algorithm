import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String baseWord = sc.nextLine();
        int[] baseCount = new int[26];

        for(int i=0; i<baseWord.length(); i++) {
            baseCount[baseWord.charAt(i) - 'A']++;
        }

        int answer = 0;
        for(int i=1; i<n; i++) {
            String currentWord = sc.nextLine();
            int[] currentCount = new int[26];
            for(int j=0; j<currentWord.length(); j++) {
                currentCount[currentWord.charAt(j) - 'A']++;
            }

            int diff = 0;
            for(int k=0; k<baseCount.length; k++) {
                diff += Math.abs(baseCount[k] - currentCount[k]);
            }


            if(diff <= 1) {
                answer++;
            } else if(diff == 2 && baseWord.length() == currentWord.length()) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}