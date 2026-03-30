import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
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
            if(str.charAt(i) == 'A') {
                temp[0]++;
            } else if(str.charAt(i) == 'C') {
                temp[1]++;
            } else if(str.charAt(i) == 'G') {
                temp[2]++;
            } else if(str.charAt(i) == 'T') {
                temp[3]++;
            }
        }

        int count = 0;
        for(int i=0; i<=n-m; i++) {
            boolean flag = true;
            for(int j=0; j<4; j++) {
                if(arr[j] > temp[j]) {
                    flag = false;
                    break;
                }
            }

            if(flag) {
                count++;
            }

            if(i == n-m) {
                break;
            }

            temp[position(str.charAt(i))]--;
            temp[position(str.charAt(i+m))]++;
        }
        System.out.println(count);
    }

    public static int position(char value) {
        int result = -1;
        if(value == 'A') {
            result = 0;
        } else if(value == 'C') {
            result = 1;
        } else if(value == 'G') {
            result = 2;
        } else if(value == 'T') {
            result = 3;
        }
        return result;
    }
}