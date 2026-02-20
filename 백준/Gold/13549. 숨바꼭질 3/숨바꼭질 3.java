import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int max = 100000;
        int[] arr = new int[max+1];
        Arrays.fill(arr, Integer.MAX_VALUE);

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(n);
        arr[n] = 0;
        while(!deque.isEmpty()){
            int value = deque.pollFirst();

            if(k == value) {
                break;
            }

            int nextValue = value * 2;
            if(nextValue <= max && arr[nextValue] > arr[value]) {
                deque.addFirst(nextValue);
                arr[nextValue] = arr[value];
            }

            nextValue = value + 1;
            if(nextValue <= max && arr[nextValue] > arr[value] + 1) {
                deque.addLast(nextValue);
                arr[nextValue] = arr[value] + 1;
            }

            nextValue = value - 1;
            if(nextValue >= 0 && arr[nextValue] > arr[value] + 1) {
                deque.addLast(nextValue);
                arr[nextValue] = arr[value] + 1;
            }
        }
        System.out.println(arr[k]);
    }
}