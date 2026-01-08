import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int answer = 0;

        while(value > 0) {
            if(value % 5 == 0) {
                answer += value / 5;
                System.out.println(answer);
                return;
            }
            value -= 3;
            answer++;
        }

        if(value < 0) {
            System.out.println(-1);
        } else {
            System.out.println(answer);
        }
    }
}