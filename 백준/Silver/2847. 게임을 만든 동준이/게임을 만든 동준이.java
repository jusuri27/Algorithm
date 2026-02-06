import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for(int i=arr.length - 1; i>0; i--) {
            if(arr[i] == arr[i-1]) {
                arr[i-1]--;
                count++;
            }
            if(arr[i] < arr[i-1]) {
                int value = arr[i-1] - arr[i] + 1;
                arr[i-1] -= value;
                count += value;
            }
        }
        System.out.println(count);
    }
}