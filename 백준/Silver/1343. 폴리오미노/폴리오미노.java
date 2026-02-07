import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();

        int count = 0;
        for(int i=0; i<str.length(); i++) {
            char current = str.charAt(i);
            if(current == '.') {
                int range = i - count;
                if(range % 2 == 1) {
                    System.out.println(-1);
                    return;
                }

                int countFour = range / 4;
                for(int j=0; j<countFour; j++) {
                    sb.append("AAAA");
                }
                if(range % 4 == 2) {
                    sb.append("BB");
                }
                sb.append(".");
                count = i+1;
            }
        }
        int lastRange = str.length() - count;
        int countFour = lastRange / 4;

        if(lastRange % 2 == 1) {
            System.out.println(-1);
            return;
        }
        for(int j=0; j<countFour; j++) {
            sb.append("AAAA");
        }
        if(lastRange % 4 == 2) {
            sb.append("BB");
        }

        System.out.println(sb);
    }
}