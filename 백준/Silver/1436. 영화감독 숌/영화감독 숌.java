import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 0;
        int cnt = 0;
        while(true) {
            i++;
            String str = String.valueOf(i);
            if(str.contains("666")) {
                cnt++;
            }
            if(cnt == n) {
                System.out.println(i);
                return;
            }
        }
    }
}