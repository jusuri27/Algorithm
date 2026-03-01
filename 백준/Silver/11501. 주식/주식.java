import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<arr.length; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            int max = arr[arr.length-1];
            long answer = 0;
            for(int k=arr.length-2; k>=0; k--) {
                if(arr[k] > max) {
                    max = arr[k];
                }
                answer += max - arr[k];
            }
            System.out.println(answer);
        }
    }
}