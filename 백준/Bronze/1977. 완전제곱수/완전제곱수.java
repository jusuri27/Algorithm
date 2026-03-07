import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int min = Integer.MAX_VALUE;
        int answer = 0;
        int count = 1;
        while(count * count <= m) {
            int value = count * count;
            if(value >= n) {
                answer += value;
                min = Math.min(min, value);
            }
            count++;
        }
        if(answer == 0) {
            System.out.println(-1);
        } else {
            System.out.println(answer);
            System.out.println(min);
        }
    }
}