import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int e = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int answer = 0;
        int e1 = 1;
        int s1 = 1;
        int m1 = 1;
        while(true) {
            answer++;
            if(e == e1 && s == s1 && m == m1) {
                break;
            }
            e1++;
            s1++;
            m1++;
            if(e1 == 16) {
                e1 = 1;
            }
            if(s1 == 29) {
                s1 = 1;
            }
            if(m1 == 20) {
                m1 = 1;
            }
        }
        System.out.println(answer);
    }
}