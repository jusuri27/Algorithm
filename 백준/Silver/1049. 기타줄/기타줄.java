import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int pakage = Integer.MAX_VALUE;
        int unit = Integer.MAX_VALUE;
        for(int i=0; i<m; i++) {
            for(int j=0; j<2; j++) {
                int value = sc.nextInt();
                if(j == 0) {
                    pakage = Math.min(pakage, value);
                } else {
                    unit = Math.min(unit, value);
                }
            }
        }
        
        if(unit == 0 || pakage == 0) {
            System.out.println(0);
            return;
        }

        int answer = 0;
        int range = pakage / unit;
        if(range >= 6) {
            answer = unit * n;
        } else {
            answer += n / 6 * pakage;
            if(n % 6 <= range) {
                answer += unit * (n % 6);
            } else {
                answer += pakage;
            }
        }

        System.out.println(answer);
    }
}