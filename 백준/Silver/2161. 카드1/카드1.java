import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();

        for(int i=1; i<=n; i++) {
            queue.add(i);
        }

        while(queue.size() != 1) {
            Integer removed = queue.poll();
            list.add(removed);
            Integer switched = queue.poll();
            queue.add(switched);
        }
        list.add(queue.poll());

        for(int i : list) {
            System.out.print(i + " ");
        }
    }
}