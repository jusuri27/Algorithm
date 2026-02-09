import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mod = 1000000000;
        long[][] arr = new long[n+1][10];
        for(int i=1; i<arr[0].length; i++) {
            arr[1][i] = 1;
        }

        for(int i=2; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                if(j == 0) {
                    arr[i][j] = arr[i-1][1] % mod;
                } else if (j == 9) {
                    arr[i][j] = arr[i-1][8] % mod;
                } else {
                    arr[i][j] = (arr[i-1][j-1] + arr[i-1][j+1]) % mod;
                }
            }
        }

        long sum = 0;
        for(int i=0; i<arr[0].length; i++) {
            sum += arr[n][i];
        }
        System.out.println(sum % mod);
    }
}

/*
10
12
98

101
121
123

210
213
232
234

1010
1012
12

 */