import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int answer = 10;
        char current = str.charAt(0);
        char prev = 'a';

        for(int i=1; i<str.length(); i++) {
            prev = current;
            current = str.charAt(i);

            if(prev == current) {
                answer += 5;
            } else {
                answer += 10;
            }
        }

        System.out.println(answer);
    }
}