import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = new String[str.length()];

        for(int i=0; i<str.length(); i++) {
            arr[i] = str.substring(i);
        }
        Arrays.sort(arr, (a, b) -> {
           return a.compareTo(b);
        });
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}