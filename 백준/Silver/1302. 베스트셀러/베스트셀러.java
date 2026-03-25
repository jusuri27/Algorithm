import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, Integer> map = new HashMap<>();

        int max = 0;
        for(int i=0; i<n; i++) {
            String value = sc.nextLine();
            map.put(value, map.getOrDefault(value, 1) + 1);
            max = Math.max(max, map.get(value));
        }

        List<String> list = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() == max) {
                list.add(entry.getKey());
            }
        }
        list.sort(null);
        System.out.println(list.get(0));
    }
}