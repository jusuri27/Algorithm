import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n;
    static int[] arr;
    static int[] temp;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        temp = new int[n];
        visited = new boolean[n];

        for(int i=0; i<arr.length; i++) {
            arr[i] = i+1;
        }

        dfs(0);
    }

    public static void dfs(int depth) {
        if(depth == n) {
            for(int i=0; i<temp.length; i++) {
                System.out.print(temp[i] + " ");
            }
            System.out.println();
            return;
        }

        for(int i=0; i<arr.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                temp[depth] = arr[i];
                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }
}