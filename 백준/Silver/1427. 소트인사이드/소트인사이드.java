import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split("");
        Arrays.sort(arr, Comparator.reverseOrder());
        for(String value : arr) {
            System.out.print(value);
        }
    }
}