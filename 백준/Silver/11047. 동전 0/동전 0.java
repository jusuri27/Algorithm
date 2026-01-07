import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int answer = 0;

        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int result = sc.nextInt();
        int[] coin = new int[cnt];

        for(int i=0; i<cnt; i++) {
            coin[i] = sc.nextInt();
        }

        for(int i=coin.length-1; i>=0; i--) {
            if(coin[i] <= result) {
                answer += result / coin[i];
                result = result % coin[i];
            }
            if(result == 0) {
                break;
            }
        }
        System.out.println(answer);
    }
}