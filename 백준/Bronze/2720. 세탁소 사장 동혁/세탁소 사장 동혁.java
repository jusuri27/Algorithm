import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            solve(Integer.parseInt(br.readLine()));
        }
    }
    public static void solve(int value) {
        int[] arr = {25, 10, 5, 1};

        for(int i=0; i<arr.length; i++) {
            System.out.print(value / arr[i] + " ");
            value = value % arr[i];
        }
        System.out.println();
    }
}