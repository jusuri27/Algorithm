import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n+1];
        arr[0] = Integer.MAX_VALUE;

        for(int i=1; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Comparator.reverseOrder());

        int max = 0;
        for(int i=1; i<arr.length; i++) {
            int sum = arr[i] * i;
            max = Math.max(max, sum);
        }
        
        System.out.println(max);
    }
}