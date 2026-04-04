import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] alphabet = new int[26];

        for(int i=0; i<str.length(); i++) {
            int value = str.charAt(i) - 'a';
            if(value >= 0) {
                int lowerLetter = str.charAt(i) - 'a';
                alphabet[lowerLetter]++;
            } else {
                int upperLetter = str.charAt(i) - 'A';
                alphabet[upperLetter]++;
            }
        }

        int max = 0;
        int maxCount = 0;
        int result = 0;
        for(int i=0; i<alphabet.length; i++) {
            if(alphabet[i] >= max) {
                if(alphabet[i] == max) {
                    maxCount++;
                    continue;
                }
                max = alphabet[i];
                result = i;
                maxCount = 1;
            }
        }
        if(maxCount > 1) {
            System.out.println("?");
        } else {
            System.out.println((char)(result + 'A'));
        }
    }
}