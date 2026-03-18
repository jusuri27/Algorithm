import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[][] arr;
    static boolean[] visited;
    static int num2;
    static int answer = -1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num1 = sc.nextInt();
        num2 = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n+1][n+1];
        visited = new boolean[n+1];

        for(int i=0; i<m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            arr[x][y] = 1;
            arr[y][x] = 1;
        }

        dfs(num1, 0);
        System.out.println(answer);
    }
    public static void dfs(int start, int count) {
        visited[start] = true;
        if(start == num2) {
            answer = count;
            return;
        }
        for(int j=0; j<arr[0].length; j++) {
            if(arr[start][j] == 1 && !visited[j]) {
                visited[j] = true;
                dfs(j, count + 1);
            }
        }
    }
}

/*
첫째 줄 : 전체 사람의 수 n
둘째 줄 : 촌수를 계산해야하는 서로 다른 두 사람의 번호 ex) 7 3
셋째 줄 : 부모 자식들 간의 관계의 개수 m
넷째 줄 : 부모 : x, 자식 : y
 */