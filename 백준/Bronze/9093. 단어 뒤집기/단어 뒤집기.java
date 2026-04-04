import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for(int i=0; i<n; i++) {
            String[] str = sc.nextLine().split(" ");
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<str.length; j++) {
                String reverseStr = new StringBuilder(str[j]).reverse().toString();
                sb.append(reverseStr + " ");
            }
            System.out.println(sb);
        }
    }
}