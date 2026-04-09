import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = true;
        isPrime[1] = true;

        int count = 0;
        int answer = 0;
        boolean found = false;
        for(int i=2; i<=n; i++) {
            if(isPrime[i]) {
                count++;
                for(int j=i*i; j<=n; j+=i) {
                    if(isPrime[j]) {
                        isPrime[j] = false;
                        count++;
                    }
                    if(count == k) {
                        found = true;
                        answer = j;
                        break;
                    }
                }
            }
            if(found) {
                break;
            }
            if(count == k) {
                answer = i;
                break;
            }

        }
        System.out.println(answer);
    }
}