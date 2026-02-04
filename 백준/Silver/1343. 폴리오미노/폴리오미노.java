import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder();
        int num = 0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == '.') {
                int range = i - num;
                if(range % 2 == 1) {
                    System.out.println(-1);
                    return;
                }
                while(range > 0) {
                    if(range >= 4) {
                        sb.append("AAAA");
                        range -= 4;
                    } else {
                        sb.append("BB");
                        range -= 2;
                    }
                }

                sb.append(".");
                num = i + 1;
            }
        }

        int lastRange = str.length() - num;
        if(lastRange % 2 == 1) {
            System.out.println(-1);
            return;
        }
        while(lastRange > 0) {
            if(lastRange >= 4) {
                sb.append("AAAA");
                lastRange -= 4;
            } else {
                sb.append("BB");
                lastRange -= 2;
            }
        }

        System.out.println(sb);
    }
}