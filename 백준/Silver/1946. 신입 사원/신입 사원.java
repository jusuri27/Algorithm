import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[n][2];
            for(int j=0; j<arr.length; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                arr[j][0] = Integer.parseInt(st.nextToken());
                arr[j][1] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr, (a, b) -> {
                return a[0] - b[0];
            });

            int min = arr[0][1];
            int count = 1;
            for(int k=1; k<arr.length; k++) {
                if(min > arr[k][1]) {
                    min = arr[k][1];
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}