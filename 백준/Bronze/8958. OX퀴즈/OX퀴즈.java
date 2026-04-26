import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            String str = sc.next();
            char current = str.charAt(0);
            int sum = 0;
            int count = 0;
            if(current == 'O') {
                count++;
                sum += count;
            }
            for(int j=1; j<str.length(); j++) {
                current = str.charAt(j);
                if(current == 'O') {
                    count++;
                    sum += count;
                } else {
                    count = 0;
                }
            }
            System.out.println(sum);
        }
    }
}