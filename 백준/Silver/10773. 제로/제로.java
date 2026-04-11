import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for(int i=0; i<n; i++) {
            int value = sc.nextInt();
            if(value != 0) {
                stack.add(value);
            } else {
                stack.pollLast();
            }
        }

        for(int i : stack) {
            answer += i;
        }
        System.out.println(answer);
    }
}