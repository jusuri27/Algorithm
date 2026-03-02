import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        List<Integer> minus = new ArrayList<>();
        List<Integer> plus = new ArrayList<>();

        for(int i=0; i<n; i++) {
            int value = Integer.parseInt(br.readLine());
            if(value == 1) {
                sum += 1;
                continue;
            }
            if(value > 0) {
                plus.add(value);
            }
            if(value <= 0) {
                minus.add(value);
            }
        }
        Collections.sort(minus);
        Collections.sort(plus, Comparator.reverseOrder());

        int plusSum = solve(plus);
        int minusSum = solve(minus);

        sum += plusSum + minusSum;
        System.out.println(sum);
    }

    public static int solve(List<Integer> arr) {
        int sum = 0;
        for(int i=0; i<arr.size()-1; i+=2) {
            sum += arr.get(i) * arr.get(i+1);
        }
        if(arr.size() % 2 == 1) {
            sum += arr.get(arr.size()-1);
        }
        return sum;
    }
}