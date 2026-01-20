import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] k = new int[n];
        for(int i=0; i<n; i++) {
            k[i] = sc.nextInt();
        }

        int[] arr = new int[11];
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;
        for(int i=4; i<11; i++) {
            arr[i] = arr[i-3] + arr[i-2] + arr[i-1];
        }

        for(int i=0; i<k.length; i++) {
            System.out.println(arr[k[i]]);
        }
    }
}
