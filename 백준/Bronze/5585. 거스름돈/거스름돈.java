import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int pay = 1000;
        int[] coin = {500, 100, 50, 10, 5, 1};
        int result = pay - value;

        int answer = 0;
        for(int i=0; i<coin.length; i++) {
            if(result >= coin[i]) {
                answer += (result / coin[i]);
                result %= coin[i];
            }
        }
        System.out.println(answer);
    }
}