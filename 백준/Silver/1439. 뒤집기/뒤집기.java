import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int countZero = 0;
        int countOne = 0;

        for(int i=1; i<str.length(); i++) {
            char prev = str.charAt(i-1);
            char current = str.charAt(i);
            if(prev != current) {
                if(prev == '0') {
                    countZero++;
                } else {
                    countOne++;
                }
            }
        }
        char lastValue = str.charAt(str.length() - 1);
        if(lastValue == '0') {
            countZero++;
        } else {
            countOne++;
        }

        if(countZero < countOne) {
            System.out.println(countZero);
        } else {
            System.out.println(countOne);
        }
    }
}