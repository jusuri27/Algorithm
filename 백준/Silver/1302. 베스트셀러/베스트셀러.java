import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, Integer> map = new HashMap<>();

        for(int i=0;  i<n; i++) {
            String value = sc.nextLine();
            map.put(value, map.getOrDefault(value, 0) + 1);
        }

        List<String> list = new ArrayList<>(map.keySet());
        list.sort((a, b) -> {
           if(map.get(a) == map.get(b)) {
               return a.compareTo(b);
           }
           return map.get(b) - map.get(a);
        });

        System.out.println(list.get(0));
    }
}