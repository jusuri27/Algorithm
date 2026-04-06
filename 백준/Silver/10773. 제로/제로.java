import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Deque<Integer> stack = new ArrayDeque<>();

        for(int i=0; i<n; i++) {
            int value = sc.nextInt();
            if(value != 0) {
                stack.add(value);
            } else {
                stack.pollLast();
            }
        }

        int answer = 0;
        for(int i : stack) {
            answer += i;
        }
        System.out.println(answer);
    }
}