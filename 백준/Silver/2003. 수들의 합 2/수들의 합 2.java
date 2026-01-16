import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] numbers = new int[n+1];
        for(int i=0; i<n; i++) {
            numbers[i] = sc.nextInt();
        }

        int low = 0;
        int high = 0;
        int sum = numbers[low];
        int count = 0;

        while(true) {
            if(high >= n) {
                break;
            }
            if(sum > m) {
                sum -= numbers[low++];
            } else if(sum == m) {
                sum += numbers[++high];
                count++;
            } else {
                sum += numbers[++high];
            }
        }
        System.out.println(count);
    }
}