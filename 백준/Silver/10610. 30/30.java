import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        char[] arr = input.toCharArray();
        Arrays.sort(arr);

        if(arr[0] != '0') {
            System.out.println(-1);
            return;
        }

        int value = 0;
        for(int i=arr.length-1; i>=0; i--) {
            value += arr[i];
            sb.append(arr[i]);
        }

        if(value % 3 != 0) {
            System.out.println(-1);
            return;
        }

        System.out.println(sb);
    }
}