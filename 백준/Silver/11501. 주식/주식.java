import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j=0; j<arr.length; j++) {
                arr[j] = sc.nextInt();
            }

            int max = arr[arr.length - 1];
            long answer = 0;
            for(int k=arr.length-2; k>=0; k--) {
                if(arr[k] > max) {
                    max = arr[k];
                } else {
                    answer += max - arr[k];
                }
            }
            System.out.println(answer);
        }
    }
}