import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new TreeMap<>();
        int size = 0;
        while(sc.hasNextLine()) {
            String value = sc.nextLine();
            if(value.isEmpty()) {
                break;
            }
            size++;
            map.put(value, map.getOrDefault(value, 0) + 1);
        }
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            double value = (double) (entry.getValue() * 100) / size;
//            double percent = Math.round(value * 10000) / 10000.0;
//            System.out.println(entry.getKey() + " " + percent);
            System.out.printf("%s %.4f\n", entry.getKey(), value);
        }
    }
}