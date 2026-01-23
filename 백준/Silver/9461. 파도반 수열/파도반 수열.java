import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            int p = sc.nextInt();
            if(p < 3) {
                System.out.println(1);
                continue;
            }
            System.out.println(find(p));
        }
    }

    public static long find(int p) {
        long[] arr = new long[p];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 1;

        for(int i=3; i<arr.length; i++) {
            arr[i] = arr[i-3] + arr[i-2];
        }
        return arr[arr.length - 1];
    }
}