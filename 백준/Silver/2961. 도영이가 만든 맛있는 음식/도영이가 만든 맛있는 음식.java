import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int[] arrS;
    static int[] arrB;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arrS = new int[n];
        arrB = new int[n];

        
        for(int i=0; i<arrS.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arrS[i] = Integer.parseInt(st.nextToken());
            arrB[i] = Integer.parseInt(st.nextToken());
        }

        dfs(1, 0, 0);
        System.out.println(min);
    }

    public static void dfs(int s, int b, int depth) {
        if(depth == n) {
            if(b != 0) {
                int result = Math.abs(s - b);
                min = Math.min(min, result);
            }
            return;
        }

        dfs(s * arrS[depth], b + arrB[depth], depth + 1);
        dfs(s, b, depth + 1);
    }

}