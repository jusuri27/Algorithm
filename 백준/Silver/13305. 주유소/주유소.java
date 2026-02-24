import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] k = new long[n-1];
        long[] price = new long[n];
        for(int i=0; i<k.length; i++){
            k[i] = sc.nextInt();
        }
        for(int i=0; i<price.length; i++) {
            price[i] = sc.nextInt();
        }

        long sum = k[0] * price[0];

        for(int i=1; i<k.length; i++) {
            long min = Integer.MAX_VALUE;
            for(int j=0; j<=i; j++) {
                min = Math.min(min, price[j]);
            }
            sum += min * k[i];
        }
        System.out.println(sum);
    }
}