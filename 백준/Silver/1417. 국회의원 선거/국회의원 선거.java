import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n == 1) {
            System.out.println(0);
            return;
        }
        Integer[] arr = new Integer[n-1];

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        Arrays.sort(arr, Comparator.reverseOrder());
        while(m <= arr[0]) {
            m++;
            arr[0]--;
            count++;
            Arrays.sort(arr, Comparator.reverseOrder());
        }
        System.out.println(count);
    }
}