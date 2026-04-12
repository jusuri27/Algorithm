import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = String.valueOf(sc.nextInt());
        int[] arr = new int[10];

        for(int i=0; i<str.length(); i++) {
            int value = str.charAt(i) - '0';
            if(value == 6 || value == 9) {
                arr[6]++;
            } else {
                arr[value]++;
            }
        }

        arr[6] = (arr[6] + 1) / 2;
        int answer = 0;
        for(int i : arr) {
            answer = Math.max(answer, i);
        }

        System.out.println(answer);

    }
}