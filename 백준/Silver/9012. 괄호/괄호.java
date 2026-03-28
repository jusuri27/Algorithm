import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for(int i=0; i<n; i++) {
            String str = sc.nextLine();
            Queue<Character> queue = new LinkedList<>();
            String answer = "YES";
            for(int j=0; j<str.length(); j++) {
                if(str.charAt(j) == '(') {
                    queue.add('(');
                }
                if(str.charAt(j) == ')') {
                    if(queue.isEmpty()) {
                        answer = "NO";
                        break;
                    } else {
                        queue.poll();
                    }
                }
            }
            if(!queue.isEmpty()) {
                answer = "NO";
            }
            System.out.println(answer);
        }
    }
}