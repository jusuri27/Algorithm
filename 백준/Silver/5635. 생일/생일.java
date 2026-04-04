import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[][] arr = new String[n][4];
        for(int i=0; i<n; i++) {
            String[] str = sc.nextLine().split(" ");
            arr[i] = str;
        }

        Arrays.sort(arr, (a, b) -> {
            int yearA = Integer.parseInt(a[3]);
            int yearB = Integer.parseInt(b[3]);
            int monthA = Integer.parseInt(a[2]);
            int monthB = Integer.parseInt(b[2]);
            int dayA = Integer.parseInt(a[1]);
            int dayB = Integer.parseInt(b[1]);

            if(yearA != yearB) {
                return yearA - yearB;
            }
            if(monthA != monthB) {
                return monthA - monthB;
            }
            return dayA - dayB;
        });

        System.out.println(arr[n-1][0]);
        System.out.println(arr[0][0]);
    }
}