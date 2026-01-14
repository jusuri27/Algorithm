import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int answer = 0;
        for(int i=1; i<=num; i++) {
            if(i<100) {
                answer++;
                continue;
            }
            if(i == 1000) {
                break;
            }
            String str = String.valueOf(i);
            char[] ch = str.toCharArray();

            if(ch[1] - ch[0] == ch[2] - ch[1]) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}