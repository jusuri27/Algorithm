import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int target;
    static int[] arr;
    static int answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        target = Integer.parseInt(st.nextToken());
        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dfs(0, 0);
        if(target == 0) {
            answer -= 1;
        }
        System.out.println(answer);
    }

    public static void dfs(int depth, int sum) {
        if(depth == n) {
            if(sum == target ) {
                answer++;
            }
            return;
        }
        dfs(depth + 1, sum + arr[depth]);
        dfs(depth + 1, sum);
    }
}