import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] alphabet = new int[26];

        for(int i=0; i<str.length(); i++) {
            int value = str.charAt(i) - 'a';
            if(value < 0) {
                int upperChar = str.charAt(i) - 'A';
                alphabet[upperChar]++;
            } else {
                int lowerChar = str.charAt(i) - 'a';
                alphabet[lowerChar]++;
            }
        }
        int max = 0;
        int result = 0;
        for(int i=0; i<alphabet.length; i++) {
            if(max <= alphabet[i]) {
                if(max == alphabet[i]) {
                    result = -1;
                    continue;
                }
                max = alphabet[i];
                result = i;
            }
        }
        if(result == -1) {
            System.out.println("?");
        } else {
            System.out.println((char)(result + 'A'));
        }
    }
}