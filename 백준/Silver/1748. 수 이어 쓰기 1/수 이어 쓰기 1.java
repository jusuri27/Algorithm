import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int answer = 0;
        for(int i=1; i<=n; i++) {
            int count = 1;
            int temp = i;
            while((temp / 10) > 0) {
                count++;
                temp /= 10;
            }
            answer += count;
        }

        System.out.println(answer);
    }
}