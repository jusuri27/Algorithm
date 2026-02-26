import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i=0; i<arr.length; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        Arrays.sort(arr, (a, b) -> {
            if(a[0] == b[0]) {
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int end = arr[0][1];
        pq.add(end);

        for(int i=1; i<arr.length; i++) {
            if(arr[i][0] >= pq.peek()) {
                pq.poll();
            }
            pq.add(arr[i][1]);
        }
        System.out.println(pq.size());
    }
}

/*
4
1 4
4 7
5 7
6 7
 */