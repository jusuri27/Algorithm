import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    static int m;
    static int answer = -1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        find(n, 1);
        System.out.println(answer);
    }

    public static void find(long n, int count) {
        if(n >= m) {
            if(n == m) {
                answer = count;
            }
            return;
        }
        String str = n + "1";
        find(n * 2, count + 1);
        find(Long.parseLong(str), count+1);
    }
}