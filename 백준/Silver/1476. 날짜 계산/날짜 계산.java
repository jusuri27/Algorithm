import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;

        int earth = sc.nextInt();
        int sun = sc.nextInt();
        int moon = sc.nextInt();

        int[] arr = {1, 1, 1};

        while(true) {
            answer++;
            if(earth == arr[0] && sun == arr[1] && moon == arr[2]) {
                System.out.println(answer);
                break;
            }
            arr[0]++;
            if(arr[0] == 16) {
                arr[0] = 1;
            }

            arr[1]++;
            if(arr[1] == 29) {
                arr[1] = 1;
            }

            arr[2]++;
            if(arr[2] == 20) {
                arr[2] = 1;
            }
        }
    }
}