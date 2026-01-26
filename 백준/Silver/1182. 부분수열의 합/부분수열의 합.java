import java.util.Scanner;

public class Main {
    static int answer;
    static int n;
    static int target;
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        target = sc.nextInt();
        arr = new int[n];

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        dfs(0, 0);

        if(target == 0) {
            System.out.println(answer -1);
        } else {
            System.out.println(answer);
        }
    }

    public static void dfs(int sum, int depth) {
        if(depth == n) {
            if(target == sum) {
                answer++;
            }
            return;
        }

        dfs(sum + arr[depth], depth + 1);
        dfs(sum, depth + 1);
    }
}