import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n;
    static int[][] arr;
    static boolean[] visited;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        // n은 짝수
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][n];
        visited = new boolean[n];

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        combi(0, 0);
        System.out.println(min);
    }

    public static void combi(int idx, int count) {
        if(count == n / 2) {
            cal();
            return;
        }

        for(int i=idx; i<n; i++) {
            if(!visited[i]) {
                visited[i] = true;
                combi(i + 1, count + 1);
                visited[i] = false;
            }
        }
    }

    public static void cal() {
        int startTeam = 0;
        int linkTeam = 0;

        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j<arr[0].length; j++) {
                if(visited[i] && visited[j]) {
                    startTeam += arr[i][j] + arr[j][i];
                } else if(!visited[i] && !visited[j]) {
                    linkTeam += arr[i][j] + arr[j][i];
                }
            }
        }
        int value = Math.abs(startTeam - linkTeam);

        if(min > value) {
            min = value;
        }
        if(min == 0) {
            System.out.println(min);
            System.exit(0);
        }
    }
}

