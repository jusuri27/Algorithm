import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] arr = new String[n];

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextLine();
        }

        Arrays.sort(arr, (a, b) -> {
            if(a.length() != b.length()) {
                return a.length() - b.length();
            }
            char[] chA = a.toCharArray();
            char[] chB = b.toCharArray();
            int sumA = 0;
            int sumB = 0;
            for(int i=0; i<chA.length; i++) {
                if(Character.isDigit(chA[i])) {
                    sumA += chA[i] - '0';
                }
            }
            for(int i=0; i<chB.length; i++){
                if(Character.isDigit(chB[i])) {
                    sumB += chB[i]  - '0';
                }
            }
            if(sumA != sumB) {
                return sumA - sumB;
            }
            return a.compareTo(b);
        });

        for(String value : arr) {
            System.out.println(value);
        }
    }
}