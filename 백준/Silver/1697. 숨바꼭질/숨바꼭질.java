import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int max = 100000;
        int[] arr = new int[max + 1];
        Arrays.fill(arr, Integer.MAX_VALUE);


        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);
        arr[n] = 0;
        while(true) {
            int value = queue.poll();
            if(value == m) {
                System.out.println(arr[value]);
                break;
            }

            int next = value * 2;
            if(max >= next && arr[next] > arr[value] + 1) {
                arr[next] = arr[value] + 1;
                queue.add(next);
            }

            next = value + 1;
            if(max >= next && arr[next] > arr[value] + 1) {
                arr[next] = arr[value] + 1;
                queue.add(next);
            }

            next = value - 1;
            if(next >= 0 && arr[next] > arr[value] + 1) {
                arr[next] = arr[value] + 1;
                queue.add(next);
            }
        }
    }
}