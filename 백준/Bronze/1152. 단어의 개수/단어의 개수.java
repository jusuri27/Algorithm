import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");

        int count = 0;
        for(int i=0; i<str.length; i++) {
            if(!str[i].isEmpty()) {
                count++;
            }
        }
        System.out.println(count);
    }
}