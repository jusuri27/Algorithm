import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            String str = sc.next();
            String answer = "YES";
            Queue<Character> queue = new LinkedList<>();

            for(int j=0; j<str.length(); j++) {
                char value = str.charAt(j);
                if(value == '(') {
                    queue.add(value);
                }
                if(value == ')') {
                    if(queue.isEmpty()) {
                        answer = "NO";
                        break;
                    }
                    queue.poll();
                }
            }
            if(!queue.isEmpty()) {
                answer = "NO";
            }
            System.out.println(answer);
        }
    }
}