import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String str = br.readLine();
        int[] arr = new int[4];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] temp = new int[4];
        for(int i=0; i<m; i++) {
            int current = checkValue(str.charAt(i));
            if(current != -1) {
                temp[current]++;
            }
        }

        int result = 0;
        for(int i=0; i<=n-m; i++) {
            boolean check = true;
            for(int j=0; j<4; j++) {
                if(arr[j] > temp[j]) {
                    check = false;
                    break;
                }
            }
            if(check) {
                result++;
            }

            if(i == n-m) {
                break;
            }

            temp[checkValue(str.charAt(i))]--;
            temp[checkValue(str.charAt(i+m))]++;
        }
        System.out.println(result);
    }

    public static int checkValue(char value) {
        if(value == 'A') {
            return 0;
        } else if(value == 'C') {
            return 1;
        } else if(value == 'G') {
            return 2;
        } else if(value == 'T') {
            return 3;
        }
        return -1;
    }
}