import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("-");

        int sum = 0;
        for(int i=0; i<str.length; i++) {
            String[] plus = str[i].split("\\+");
            int value = 0;
            for(int j=0; j<plus.length; j++) {
                value += Integer.parseInt(plus[j]);
            }

            if(i == 0) {
                sum += value;
            } else {
                sum -= value;
            }
        }

        System.out.println(sum);
    }
}