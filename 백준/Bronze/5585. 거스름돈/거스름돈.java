import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int pay = 1000;
        int[] coin = {500, 100, 50, 10, 5, 1};
        int price = Integer.parseInt(br.readLine());

        int change = pay - price;
        int answer = 0;

        for(int i=0; i<coin.length; i++) {
            if(change >= coin[i]) {
                answer += change / coin[i];
                change = change % coin[i];
            }
        }

        System.out.println(answer);
    }
}