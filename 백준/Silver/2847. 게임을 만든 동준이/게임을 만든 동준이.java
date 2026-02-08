import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int answer = 0;
        for(int i=arr.length-1; i>0; i--) {
            if(arr[i-1] >= arr[i]) {
                int count = arr[i-1] - arr[i] + 1;
                arr[i-1] = arr[i-1] - count;
                answer += count;
            }
        }
        System.out.println(answer);
    }
}