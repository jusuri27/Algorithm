import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        List<String> list = new ArrayList<>();
        String[] str2 = new String[m];

        for(int i=0; i<n; i++) {
            list.add(br.readLine());
        }
        int count = 0;
        for(int i=0; i<str2.length; i++) {
            if(list.contains(br.readLine())) {
                count++;
            }
        }
        System.out.println(count);

    }
}