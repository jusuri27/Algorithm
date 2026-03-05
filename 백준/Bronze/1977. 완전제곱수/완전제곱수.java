import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int count = 1;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        while(count * count <= n) {
            int value = count * count;
            if(value >= m && value <= n) {
                sum += value;
                min = Math.min(min, value);
            }
            count++;
        }
        if(sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}