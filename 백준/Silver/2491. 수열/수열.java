import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int maxValue = 0;
        int minValue = Integer.MAX_VALUE;
        int maxCount = 0;
        int minCount = 0;
        int max = 0;
        for(int i=0; i<arr.length; i++) {
            if(maxValue <= arr[i]) {
                maxValue = arr[i];
                maxCount++;
            } else {
                maxValue = arr[i];
                maxCount = 1;
            }
            if(minValue >= arr[i]) {
                minValue = arr[i];
                minCount++;
            } else {
                minValue = arr[i];
                minCount = 1;
            }
            max = Math.max(max, Math.max(minCount, maxCount));
        }
        System.out.println(max);
    }
}