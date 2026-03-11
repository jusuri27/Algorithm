import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        boolean[] arr = new boolean[10];

        if(m > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0; i<m; i++) {
                arr[Integer.parseInt(st.nextToken())] = true;
            }
        }
        
        int answer = Math.abs(100-n);
        for(int i=0; i<1000000; i++) {
            String str = String.valueOf(i);

            boolean broken = false;
            for(int j=0; j<str.length(); j++) {
                if(arr[str.charAt(j) - '0']) {
                    broken = true;
                    break;
                }
            }

            if(!broken) {
                int value = Math.abs(n - i) + str.length();
                answer = Math.min(answer, value);
            }
        }
        System.out.println(answer);
    }
}