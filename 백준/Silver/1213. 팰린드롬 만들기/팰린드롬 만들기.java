import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] arr = new int[26];

        for(int i=0; i<str.length(); i++) {
            int value = str.charAt(i) - 'A';
            arr[value]++;
        }

        char mid = '0';
        StringBuilder front = new StringBuilder();
        StringBuilder end = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        boolean check = false;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] % 2 == 1) {
                if(check) {
                    System.out.println("I'm Sorry Hansoo");
                    return;
                }
                mid = (char)(i + 'A');
                check = true;
            }

            for(int j=0; j<arr[i]/2; j++) {
                char value = (char)(i+'A');
                front.append(value);
                end.insert(0, value);
            }
        }
        if(check) {
            System.out.println(sb.append(front).append(mid).append(end));
        } else {
            System.out.println(sb.append(front).append(end));
        }
    }
}