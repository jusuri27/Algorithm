import java.util.Scanner;

public class Main {
    static int[] sArr;
    static int[] bArr;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sArr = new int[n];
        bArr = new int[n];

        for(int i=0; i<n; i++) {
            sArr[i] = sc.nextInt();
            bArr[i] = sc.nextInt();
        }

        solve(1,0, 0);
        System.out.println(min);
    }

    public static void solve(int s, int b, int depth) {
        if(depth == sArr.length) {
            if(b != 0) {
                int value = Math.abs(s - b);
                min = Math.min(min, value);
            }
            return;
        }

        solve(s * sArr[depth], b + bArr[depth], depth + 1);
        solve(s, b, depth+1);
    }
}