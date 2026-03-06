import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        String[] temp = String.valueOf(n).split("");
        temp[temp.length-1] = "0";
        temp[temp.length-2] = "0";
        String str = String.join("", temp);
        int value = Integer.parseInt(str);

        while(value % k != 0) {
            value++;
        }

        String answer = String.format("%02d", value % 100);
        System.out.println(answer);
    }
}