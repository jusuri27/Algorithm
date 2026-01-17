import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] cards = new int[n];

        for(int i=0; i<n; i++) {
            cards[i] = sc.nextInt();
        }

        int highNum = 0;
        for(int i = 0; i < cards.length; i++) {
            for(int j = i+1; j <cards.length; j++) {
                for(int k=j+1; k<cards.length; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    if(sum == m) {
                        System.out.println(sum);
                        return;
                    }
                    if(sum < m) {
                        highNum = Math.max(highNum, sum);
                    }
                }
            }
        }
        System.out.println(highNum);
    }
}