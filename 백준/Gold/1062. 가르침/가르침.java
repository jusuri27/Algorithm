import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static boolean[] word = new boolean[26];
    static String[] arr;
    static int num;
    static int max;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        num = k - 5;
        arr = new String[n];

        init();

        if(num < 0) {
            System.out.println(0);
            return;
        }

        for(int i=0; i<arr.length; i++) {
            arr[i] = br.readLine();
        }

        dfs(0, 0);
        System.out.println(max);
    }

    public static void dfs(int depth, int start) {
        if(depth == num) {
            int result = solve();
            max = Math.max(max, result);
            return;
        }

        for(int i=start; i<word.length; i++) {
            if(!word[i]) {
                word[i] = true;
                dfs(depth + 1, i + 1);
                word[i] = false;
            }
        }
    }

    public static int solve() {
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            String str = arr[i];
            boolean check = true;
            for(int j=0; j<str.length(); j++) {
                if(!word[str.charAt(j)-'a']) {
                    check = false;
                    break;
                }
            }
            if(check) {
                count++;
            }
        }
        return count;
    }

    public static void init() {
        word['a'-'a'] = true;
        word['n'-'a'] = true;
        word['t'-'a'] = true;
        word['i'-'a'] = true;
        word['c'-'a'] = true;
    }
}