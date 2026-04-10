import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int max = 0;
        int prev = 0;
        int current = sc.nextInt();
        int sum = 0;
        for(int i=1; i<n; i++) {
            prev = current;
            current = sc.nextInt();
            if(current > prev) {
                sum += current - prev;
            } else {
                max = Math.max(max, sum);
                sum = 0;
            }
        }
        max = Math.max(max, sum);
        System.out.println(max);
    }
}