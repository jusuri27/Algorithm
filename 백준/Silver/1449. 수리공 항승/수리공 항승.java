import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int count = arr[0] + l;
        int answer = 1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] < count) {
                continue;
            } else {
                count = arr[i] + l;
                answer++;
            }
        }
        System.out.println(answer);
    }
}