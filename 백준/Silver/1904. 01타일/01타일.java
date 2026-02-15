import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        if(n >= 1) {
            arr[1] = 1;
        }
        if(n >= 2) {
            arr[2] = 2;
        }
        for(int i=3; i<arr.length; i++) {
            arr[i] = (arr[i-2] + arr[i-1]) % 15746;
        }
        System.out.println(arr[n]);
    }
}


/*
1
1

2
00
11

3
001
100
111

4
0000
0011
1001
1100
1111

 */