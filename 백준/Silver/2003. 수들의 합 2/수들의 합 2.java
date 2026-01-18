import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n+1];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int low = 0;
        int high = 0;
        int sum = arr[0];
        int answer = 0;
        
        while(high < n) {
            if(sum < m) {
                sum += arr[++high];
            } else if(sum == m) {
                sum += arr[++high];
                answer++;
            } else if(sum > m) {
                sum -= arr[low++];
            }
        }
        System.out.println(answer);
    }
}