import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];

        for(int i=0; i<arr.length; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            arr[i][0] = a;
            arr[i][1] = b;
        }

        Arrays.sort(arr, (a, b) -> {
            return a[0] - b[0];
        });

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<arr.length; i++) {
            pq.add(arr[i][1]);
            if(pq.peek() <= arr[i][0]) {
                pq.poll();
            }
        }
        System.out.println(pq.size());
    }
}

/*

3
2 4
1 3
3 5
 */
