import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n % 2 == 1) {
            System.out.println("SK");
        } else {
            System.out.println("CY");
        }
    }
}

/*
1 sk

2
1 1 cy

3
3 sk

4
1 3 cy
3 1 cy
cy

5
1 1 3 sk
1 3 1 sk
3 1 1 sk

6
3 3 cy
3 1 1 1 cy
1 1 1 3 cy

7
3 3 1 sk
3 1 3
 */