import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int max = 100000;
        int[] arr = new int[max + 1];
        Arrays.fill(arr, Integer.MAX_VALUE);

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        queue.add(n);
        arr[n] = 0;
        while(!queue.isEmpty()) {
            int current = queue.poll();
            if(current == k) {
                System.out.println(arr[current]);
                break;
            }

            int next = current * 2;
            if(max >= next && arr[next] > arr[current]) {
                arr[next] = arr[current];
                queue.addFirst(next);
            }

            next = current + 1;
            if(max >= next && arr[next] > arr[current] + 1) {
                arr[next] = arr[current] + 1;
                queue.addLast(next);
            }

            next = current - 1;
            if(next >= 0 && arr[next] > arr[current] + 1) {
                arr[next] = arr[current] + 1;
                queue.addLast(next);
            }
        }
    }
}