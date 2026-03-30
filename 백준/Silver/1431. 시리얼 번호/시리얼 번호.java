import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] arr = new String[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextLine();
        }

        Arrays.sort(arr, (a,b) -> {
            if(a.length() != b.length()) {
                return a.length() - b.length();
            }

            int sumA = getSum(a);
            int sumB = getSum(b);
            if(sumA != sumB) {
                return sumA - sumB;
            }

            return a.compareTo(b);
        });
        for(String str : arr) {
            System.out.println(str);
        }
    }

    public static int getSum(String arr) {
        int sum = 0;
        for(int i=0; i<arr.length(); i++) {
            int value = arr.charAt(i) - 'A';
            if(value < 0) {
                sum += arr.charAt(i) - '0';
            }
        }
        return sum;
    }
}