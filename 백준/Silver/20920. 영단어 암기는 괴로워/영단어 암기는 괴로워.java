import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++) {
            String value = br.readLine();
            if(value.length() >= m) {
                map.put(value, map.getOrDefault(value, 0) + 1);
            }
        }
        List<String> list = new ArrayList<>(map.keySet());
        list.sort((a, b) -> {
            if(map.get(a) != map.get(b)) {
                return map.get(b) - map.get(a);
            }
            if(a.length() != b.length()) {
                return b.length() - a.length();
            }
            return a.compareTo(b);
        });
        StringBuilder sb = new StringBuilder();
        for(String value : list) {
            sb.append(value).append("\n");
        }
        System.out.println(sb);
    }
}