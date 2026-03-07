import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        a = a.replace(b, "*");

        int answer = 0;
        for(int i=0; i<a.length(); i++) {
            if(a.charAt(i) == '*') {
                answer++;
            }
        }
        System.out.println(answer);
    }
}