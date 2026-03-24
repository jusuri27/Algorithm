import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashSet<String> set = new HashSet<>();
        for(int i=0; i<str.length(); i++) {
            for(int j=1; j<=str.length(); j++) {
                if(j > i) {
                    set.add(str.substring(i, j));
                }
            }
        }
        System.out.println(set.size());
    }
}