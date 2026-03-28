import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        boolean check = false;

        for(int i=0; i<str.length(); i++) {
            char current = str.charAt(i);
            if(current == '<') {
                while(!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                check = true;
            }
            if(current == '>') {
                check = false;
                sb.append(current);
                continue;
            }
            if(check) {
               sb.append(current);
            }
            if(!check) {
                if(current == ' ') {
                    while(!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(current);
                } else {
                    stack.push(current);
                }
            }
        }
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        System.out.println(sb);
    }
}