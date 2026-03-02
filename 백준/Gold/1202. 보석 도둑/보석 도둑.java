import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[][] bag = new int[n][2];
        int[] weight = new int[k];

        for(int i=0; i<bag.length; i++) {
            st = new StringTokenizer(br.readLine());
            bag[i][0] = Integer.parseInt(st.nextToken());
            bag[i][1] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<weight.length; i++) {
            st = new StringTokenizer(br.readLine());
            weight[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(bag, (a, b) -> {
            return a[0] - b[0];
        });
        Arrays.sort(weight);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());


        long sum = 0;
        int idx = 0;
        for(int i=0; i<weight.length; i++) {
            while(bag.length > idx && weight[i] >= bag[idx][0]) {
                pq.add(bag[idx][1]);
                idx++;
            }
            if(pq.size() > 0) {
                sum += pq.poll();
            }
        }
        System.out.println(sum);

    }
}