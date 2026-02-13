import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int highMax = 0;
        for(int i=0; i<arr.length; i++) {
            int highTemp = arr[i];
            int highCount = 1;
            for(int j=i+1; j<arr.length; j++) {
                if(highTemp <= arr[j]) {
                    highTemp = arr[j];
                    highCount++;
                    continue;
                }
                break;
            }
            highMax = Math.max(highMax, highCount);
        }

        int lowMax = 0;
        for(int i=0; i<arr.length; i++) {
            int lowTemp = arr[i];
            int lowCount = 1;
            for(int j=i+1; j<arr.length; j++) {
                if(lowTemp >= arr[j]) {
                    lowTemp = arr[j];
                    lowCount++;
                    continue;
                }
                break;
            }
            lowMax = Math.max(lowMax, lowCount);
        }
        System.out.println(Math.max(highMax, lowMax));
    }
}