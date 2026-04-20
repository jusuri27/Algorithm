import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char current = str.charAt(0);
        int answer = 10;
        for(int i=1; i<str.length(); i++) {
            char prev = current;
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