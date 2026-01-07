import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int answer = 0;

        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();
        int[] time = new int[people];
        for(int i=0; i<people; i++) {
            time[i] = sc.nextInt();
        }
        Arrays.sort(time);

        int waitTime = 0;
        for(int i=0; i<time.length; i++) {
            waitTime += time[i];
            answer += waitTime;
        }

        System.out.println(answer);
    }
}