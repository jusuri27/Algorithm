import java.util.Scanner;

public class Main {
    static long end;
    static int answer;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long start = sc.nextInt();
        end = sc.nextInt();

        dfs(start, 1);
        if(answer > 0) {
            System.out.println(answer);
        } else {
            System.out.println(-1);
        }
    }
    public static void dfs(long num, int count) {
        if(num >= end) {
            if(num == end) {
                answer = count;
            }
            return;
        }
        dfs(num * 2, count + 1);
        dfs(Long.parseLong(num+"1"), count + 1);
    }
}