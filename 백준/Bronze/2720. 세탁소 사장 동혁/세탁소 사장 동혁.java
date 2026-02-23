import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            int value = sc.nextInt();
            solve(value);
            System.out.println();
        }
    }

    public static void solve(int value) {
        int q = 25;
        int d = 10;
        int n = 5;
        int p = 1;
        int[] arr = new int[4];

        arr[0] = value / q;
        value = value % q;

        arr[1] = value / d;
        value = value % d;

        arr[2] = value / n;
        value = value % n;

        arr[3] = value / p;

        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}