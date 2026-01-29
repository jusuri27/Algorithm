import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        solve(a, b, 0);
    }

    public static void solve(int a, int b, int count) {
        if(a == b) {
            System.out.println(count);
            return;
        }
        solve((a + 1) / 2, (b + 1) / 2, count+1);
    }
}