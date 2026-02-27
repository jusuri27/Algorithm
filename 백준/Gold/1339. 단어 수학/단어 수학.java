import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<List<String>> arr = new ArrayList<>();

        for(int i=0; i<n; i++) {
            String str = br.readLine();
            arr.add(Arrays.asList(str.split("")));
        }

        HashMap<String, Integer> map = new HashMap<>();

        for(int i=0; i<arr.size(); i++) {
            int count = 1;
            for(int j=arr.get(i).size()-1; j>=0; j--) {
                String key = arr.get(i).get(j);
                map.put(key, map.getOrDefault(key, 0) + count);
                count *= 10;
            }
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((e1, e2) -> e2.getValue() - e1.getValue());

        int num = 9;
        int sum = 0;
        for (Map.Entry<String, Integer> entry : list) {
            sum += entry.getValue() * num;
            num--;
        }
        System.out.println(sum);
    }
}