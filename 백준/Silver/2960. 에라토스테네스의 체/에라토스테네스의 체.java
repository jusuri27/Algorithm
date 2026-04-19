import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        boolean[] isPrime = new boolean[n+1];

        int count = 0;
        int answer = 0;
        boolean found = false;
        for(int i=2; i<=n; i++) {
            for(int j=i; j<=n; j+=i) {
                if(!isPrime[j]) {
                    isPrime[j] = true;
                    count++;
                    if(count == k) {
                        answer = j;
                        found = true;
                        break;
                    }
                }
            }
            if(found) {
                break;
            }
        }
        System.out.println(answer);
    }
}