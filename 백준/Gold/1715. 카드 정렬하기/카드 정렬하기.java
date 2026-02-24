import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<n; i++) {
            pq.add(sc.nextInt());
        }

        int sum = 0;
        while(pq.size() > 1) {
            int a = pq.poll();
            int b = pq.poll();

            sum += a + b;
            pq.add(a+b);
        }
        System.out.println(sum);
    }
}