import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0; i<n; i++) {
            String[] arr = sc.nextLine().split(" ");
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<arr.length; j++) {
                String str = new StringBuilder(arr[j]).reverse().toString();
                sb.append(str + " ");
            }
            System.out.println(sb);
        }
    }
}