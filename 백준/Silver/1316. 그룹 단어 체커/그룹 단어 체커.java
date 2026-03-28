import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int count = 0;
        for(int i=0; i<n; i++) {
            String str = sc.nextLine();
            char[] ch = new char[26];
            boolean check = true;
            ch[str.charAt(0)-'a']++;
            for(int j=1; j<str.length(); j++) {
                int current = str.charAt(j) - 'a';
                int prev = str.charAt(j-1) - 'a';
                if(prev != current && ch[current] != 0) {
                    check = false;
                    break;
                }
                ch[current]++;
            }
            if(check) {
                count++;
            }
        }
        System.out.println(count);
    }
}