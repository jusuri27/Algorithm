import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int[] arr;
    static int[] result;
    static boolean[] visited;
    static int max = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        visited = new boolean[n];
        result = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        find(0);
        System.out.println(max);
    }

    public static void find(int depth) {
        if(depth == n) {
            int sum = 0;
            for(int i=0; i<result.length-1; i++) {
                sum += Math.abs(result[i] - result[i+1]);
            }
            max = Math.max(sum, max);
            return;
        }

        for(int i=0; i<arr.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                result[depth] = arr[i];
                find(depth + 1);
                visited[i] = false;
            }
        }
    }
}