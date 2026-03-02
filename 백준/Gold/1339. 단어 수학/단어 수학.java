import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[26];
        Arrays.fill(arr, 0);

        for(int i=0; i<n; i++) {
            String str = br.readLine();
            int num = 1;
            for(int j=str.length()-1; j>=0; j--) {
                arr[str.charAt(j) - 'A'] += num;
                num *= 10;
            }
        }

        Arrays.sort(arr, Comparator.reverseOrder());

        int count = 9;
        int sum = 0;
        for(int i=0; i<26; i++) {
            if(arr[i] != 0) {
                sum += arr[i] * count;
            }
            count--;
        }
        System.out.println(sum);
    }
}