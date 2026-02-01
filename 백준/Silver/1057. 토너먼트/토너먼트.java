import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int t1 = Integer.parseInt(st.nextToken());
        int t2 = Integer.parseInt(st.nextToken());

        int count = 0;
        while(true) {
            if(t1 == t2) {
                System.out.println(count);
                break;
            }
            t1 = (t1 + 1) / 2;
            t2 = (t2 + 1) / 2;
            count++;
        }
    }
}