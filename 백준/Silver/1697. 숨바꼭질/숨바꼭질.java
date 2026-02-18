import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        int[] visited = new int[100001];
        int cnt = 0;
        queue.add(n);
        while(true) {
            int current = queue.poll();
            if(current == k) {
                System.out.println(visited[current]);
                break;
            }
            if(current - 1 >= 0 && visited[current - 1] == 0) {
                queue.add(current - 1);
                visited[current - 1] = visited[current] + 1;
            }
            if(current + 1 <= 100000 && visited[current + 1] == 0) {
                queue.add(current + 1);
                visited[current + 1] = visited[current] + 1;
            }
            if(current * 2 <= 100000 && visited[current * 2] == 0) {
                queue.add(current * 2);
                visited[current * 2] = visited[current] + 1;
            }
        }
    }
}