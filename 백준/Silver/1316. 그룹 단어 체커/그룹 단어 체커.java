import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int count = 0;
        for(int i=0; i<n; i++) {
            HashMap<Character, Integer> map = new HashMap<>();
            String str = sc.nextLine();
            boolean check = true;
            map.put(str.charAt(0), 0);
            for(int j=1; j<str.length(); j++) {
                Character value = str.charAt(j);
                if(map.containsKey(value)) {
                    if(map.get(value) != j-1) {
                        check = false;
                        break;
                    }
                }
                map.put(value, j);
            }
            if(check) {
                count++;
            }
        }
        System.out.println(count);
    }
}