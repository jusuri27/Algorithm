import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[] arr = new boolean[10];
        for(int i=0; i<m; i++) {
            arr[sc.nextInt()] = true;
        }

        int answer = Math.abs(n-100);
        for(int i=0; i<=999999; i++) {
            String value = String.valueOf(i);

            boolean check = true;
            for(int j=0; j<value.length(); j++) {
                if(arr[value.charAt(j) - '0']) {
                    check = false;
                    break;
                }
            }

            if(check) {
                int num = Math.abs(n-i) + value.length();
                answer = Math.min(answer, num);
            }
        }
        System.out.println(answer);
    }
}