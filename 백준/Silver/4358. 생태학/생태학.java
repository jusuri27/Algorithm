import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new TreeMap<>();
        int size = 0;
        while(sc.hasNextLine()) {
            String value = sc.nextLine();
            if(value.isEmpty()) {
               break;
            }
            map.put(value, map.getOrDefault(value, 0) + 1);
            size++;
        }
        for(Map.Entry<String, Integer> item : map.entrySet()) {
            double value = (double) (item.getValue() * 100) / size;
            System.out.printf("%s %.4f\n", item.getKey(), value);
        }
    }
}