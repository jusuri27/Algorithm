import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[10];
        char[] sum = String.valueOf(a * b * c).toCharArray();
        
        for(int i=0; i<sum.length; i++) {
            arr[sum[i] - '0']++;
        }
        
        for(int i : arr) {
            System.out.println(i);
        }
    }
}