import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] waitTime = new int[count];

        for(int i = 0; i < count; i++) {
            waitTime[i] = sc.nextInt();
        }

        Arrays.sort(waitTime);

        int sum = 0;
        int answer = 0;
        for(int i=0; i<waitTime.length; i++) {
            sum += waitTime[i];
            answer += sum;
        }

        System.out.println(answer);
    }
}