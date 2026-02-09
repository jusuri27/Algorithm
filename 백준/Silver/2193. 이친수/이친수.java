import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n+1];
        if(n <= 2) {
            System.out.println(1);
            return;
        }
        arr[1] = 1;
        arr[2] = 1;
        for(int i=3; i<arr.length; i++) {
            arr[i] = arr[i-2] + arr[i-1];
        }
        System.out.println(arr[n]);
    }
}

/*
n = 1
1

n = 2
10

n = 3
101
100

n = 4
1000
1001
1010

n = 5
10000
10001
10010
10100
10101
 */