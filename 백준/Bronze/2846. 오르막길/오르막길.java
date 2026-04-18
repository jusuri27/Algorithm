import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int answer = 0;
        int prev = 0;
        int current = sc.nextInt();
        int sum = 0;
        for(int i=1; i<n; i++) {
            prev = current;
            current = sc.nextInt();

            if(current > prev) {
                sum += current - prev;
            } else {
                answer = Math.max(answer, sum);
                sum = 0;
            }
        }
        answer = Math.max(answer, sum);
        System.out.println(answer);
    }
}