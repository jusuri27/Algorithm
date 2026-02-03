import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// 무게를 내림차순으로 정렬
// 가장 무거운 로프부터 n, n+1, n+2 의 합계를 구함
public class Main {
    static int n;
    static Integer[] arr;
    static int max;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new Integer[n];

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Comparator.reverseOrder());

        max = arr[0];
        find(1);
        System.out.println(max);
    }

    public static void find(int count) {
        if(count == n) {
            return;
        }
        int average = 0;
        for(int i=0; i<count; i++) {
            average = Math.min(arr[i], arr[i+1]);
        }
        max = Math.max(max, average * (count + 1));
        find(count + 1);
    }
}