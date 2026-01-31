import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;
        int target = 100;
        int min = Integer.MAX_VALUE;
        int answer = 0;
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
            int value = Math.abs(target - sum);
            if(value <= min) {
                min = value;
                answer = sum;
            }
        }
        System.out.println(answer);
    }
}