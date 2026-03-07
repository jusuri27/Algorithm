import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int m = Integer.parseInt(sc.nextLine());

        n = n - (n % 100);

        while(n % m != 0) {
            n++;
        }
        System.out.printf("%02d", n % 100);
    }
}