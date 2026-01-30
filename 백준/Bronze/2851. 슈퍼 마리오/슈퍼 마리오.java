import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int answer = 0;
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int value = 100;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
            if(min >= Math.abs(value - sum)) {
                min = value - sum;
                answer = sum;
            }
        }
        System.out.println(answer);
    }
}