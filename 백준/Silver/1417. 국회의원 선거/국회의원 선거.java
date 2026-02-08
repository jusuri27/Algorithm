import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int target = arr[0];
        int count = 0;
        while(true) {
            int max = 0;
            int idx = 0;
            for(int i=1; i<arr.length; i++) {
                if(max < arr[i]) {
                    max = arr[i];
                    idx = i;
                }
            }
            if(target > max) {
                System.out.println(count);
                break;
            }
            arr[idx]--;
            target++;
            count++;
        }
    }
}