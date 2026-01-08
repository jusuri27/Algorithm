import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value = sc.next();

        char[] arr = String.valueOf(value).toCharArray();
        StringBuilder sb = new StringBuilder();

        Arrays.sort(arr);
        int sum = 0;
        for(int i=arr.length-1; i>=0; i--) {
            int num = arr[i] - '0';
            sum += num;
            sb.append(num);
        }
        if(arr[0] != '0' || sum % 3 !=0) {
            System.out.println(-1);
            return;
        }
        System.out.println(sb);
    }
}