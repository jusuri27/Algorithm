import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int mid = (str.length() + 1) / 2;
        int answer = 1;
        for(int i=0; i<str.length(); i++) {
            if(i == mid) {
                break;
            }
            if(str.charAt(i) != str.charAt(str.length()-(i + 1))) {
                answer = 0;
                break;
            }
        }
        System.out.println(answer);
    }
}