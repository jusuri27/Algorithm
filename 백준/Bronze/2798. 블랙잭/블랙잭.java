import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int card = sc.nextInt();
        int value = sc.nextInt();

        int[] arr = new int[card];
        for(int i=0; i<card; i++) {
            arr[i] = sc.nextInt();
        }

        int max = 0;
        for(int i=0; i<arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if(sum > max && value >= sum) {
                        max = sum;
                    }
                }
            }
        }
        System.out.println(max);
    }
}