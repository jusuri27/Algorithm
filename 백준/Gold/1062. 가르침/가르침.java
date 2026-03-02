import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static boolean[] learned = new boolean[26];
    static String[] arr;
    static int r;
    static int max = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        r = k - 5;
        arr = new String[n];
        if(r < 0) {
            System.out.println(0);
            return;
        }
        learned['a' - 'a'] = true;
        learned['n' - 'a'] = true;
        learned['t' - 'a'] = true;
        learned['i' - 'a'] = true;
        learned['c' - 'a'] = true;

        for(int i=0; i<arr.length; i++) {
            arr[i] = br.readLine();
        }
        solve(0, 0);
        System.out.println(max);
    }

    public static void solve(int depth, int start) {
        if(depth == r) {
            int count = find();
            max = Math.max(max, count);
            return;
        }

        for(int i=start; i<learned.length; i++) {
            if(!learned[i]) {
                learned[i] = true;
                solve(depth + 1, i + 1);
                learned[i] = false;
            }
        }
    }

    public static int find() {
        int answer = 0;
        for(int i=0; i<arr.length; i++) {
            boolean check = true;
            for(int j=0; j<arr[i].length(); j++) {
                int value = arr[i].charAt(j) - 'a';
                if(!learned[value]) {
                    check = false;
                    break;
                }
            }
            if(check) {
                answer++;
            }
        }
        return answer;
    }
}