import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            int temp = i;
            int sum = 0;
            while(temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            if(sum+i == n) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}