import java.util.Scanner;

public class Main {
    static int n;
    static int[] arr;
    static int[] cal;
    static boolean[] visited;
    static int result;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        cal = new int[n];
        visited = new boolean[n];
        result = 0;

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        dfs(0);
        System.out.println(result);
    }

    public static void dfs(int depth) {
        if(depth == n) {
            int sum = 0;
            for(int i=0; i<cal.length - 1; i++) {
                sum += Math.abs(cal[i] - cal[i + 1]);
            }
            result = Math.max(result, sum);
            return;
        }

        for(int i=0; i<arr.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                cal[depth] = arr[i];
                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }
}