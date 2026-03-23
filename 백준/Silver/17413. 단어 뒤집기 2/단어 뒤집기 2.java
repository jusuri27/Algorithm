import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder answer = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        boolean check = false;
        for(int i=0; i<str.length(); i++) {
            char value = str.charAt(i);
            if(value == '<') {
                if(temp.length() > 0) {
                    String val = new StringBuilder(temp).reverse().toString();
                    answer.append(val);
                    temp = new StringBuilder();
                }
                check = true;
                answer.append(value);
                continue;
            }
            if(value == '>') {
                check = false;
                answer.append(value);
                continue;
            }
            if(check) {
                answer.append(value);
            }
            if(!check) {
                if(value == ' ') {
                    if(temp.length() > 0) {
                        String val = new StringBuilder(temp).reverse().toString();
                        answer.append(val);
                        temp = new StringBuilder();
                    }
                    answer.append(value);
                } else {
                    temp.append(value);
                }
            }
        }
        if(temp.length() > 0) {
            String val = new StringBuilder(temp).reverse().toString();
            answer.append(val);
        }
        System.out.println(answer);
    }
}