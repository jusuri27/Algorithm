import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] arr = new int[n][2];
        int[] weight = new int[k];

        for(int i=0; i<arr.length; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        for(int i=0; i<weight.length; i++) {
            weight[i] = sc.nextInt();
        }

        Arrays.sort(arr, (a, b) -> {
            return a[0] - b[0];
        });
        Arrays.sort(weight);

        int j = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        long sum = 0;
        for(int i=0; i<weight.length; i++) {
            while(j < arr.length && arr[j][0] <= weight[i]) {
                pq.add(arr[j][1]);
                j++;
            }
            if(!pq.isEmpty()) {
                int value = pq.poll();
                sum += value;
            }
        }
        System.out.println(sum);
    }
}

/*

3 2
10 10
5 8
100 100
11
9

 */