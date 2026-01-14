import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();

        int count = 0;
        int i = 0;
        while(true) {
            i++;
            String str = String.valueOf(i);
            if(str.contains("666")) {
                count++;
            }
            if(answer == count) {
                System.out.println(i);
                break;
            }
        }
    }
}